// default package

import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.media.AudioDeviceInfo;
import android.text.TextUtils;
import android.util.LongSparseArray;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class x30 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x30(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    private final void a() {
        boolean z;
        f11 f11Var = (f11) this.b;
        Runnable runnable = (Runnable) this.c;
        synchronized (f11Var.g) {
            z = f11Var.h;
        }
        if (z) {
            return;
        }
        runnable.run();
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b8 A[LOOP:3: B:39:0x00b6->B:40:0x00b8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0178 A[LOOP:7: B:84:0x0176->B:85:0x0178, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0199  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        u00 u00Var;
        int i;
        int i2;
        qw0 qw0Var;
        uv0 uv0Var;
        TL_bots.BotInfo botInfo;
        TL_bots.botAppSettings botappsettings;
        int size;
        int i3;
        Iterator it;
        int size2;
        int i4;
        int size3;
        int i5;
        w01 w01Var;
        int size4;
        int i6;
        int size5;
        int i7;
        int size6;
        Iterator it2;
        int i8;
        HashMap hashMap;
        boolean z;
        int i9 = 0;
        boolean z2 = true;
        switch (this.a) {
            case 0:
                h40 h40Var = (h40) this.b;
                Throwable th = (Throwable) this.c;
                h40Var.getClass();
                h40Var.g(th instanceof Exception ? (Exception) th : new RuntimeException(th));
                return;
            case 1:
                h40 h40Var2 = (h40) this.b;
                File file = (File) this.c;
                synchronized (h40Var2.m) {
                    while (true) {
                        int size7 = h40Var2.m.size();
                        ArrayList arrayList = h40Var2.m;
                        if (i9 < size7) {
                            File file2 = (File) arrayList.get(i9);
                            if ((file == null || !file.equals(file2)) && file2.exists() && !file2.delete()) {
                                h40Var2.h.b("temporary file deletion failed: " + file2.getName());
                            }
                            i9++;
                        } else {
                            arrayList.clear();
                        }
                    }
                }
                return;
            case 2:
                lx6 lx6Var = (lx6) this.b;
                String str = (String) this.c;
                o40 o40Var = (o40) lx6Var.c;
                String str2 = hac.a;
                xa3 xa3Var = ((c74) o40Var).a.s;
                tk U = xa3Var.U();
                xa3Var.V(U, 1012, new ua3(U, str, (byte) 24));
                return;
            case 3:
                lx6 lx6Var2 = (lx6) this.b;
                hl2 hl2Var = (hl2) this.c;
                o40 o40Var2 = (o40) lx6Var2.c;
                String str3 = hac.a;
                ((c74) o40Var2).a.F.H(hl2Var);
                return;
            case 4:
                e50 e50Var = (e50) this.b;
                AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) this.c;
                if (e50Var.d == null || (u00Var = ((l50) e50Var.b.b).h) == null || audioDeviceInfo.equals((AudioDeviceInfo) u00Var.s)) {
                    return;
                }
                u00Var.s = audioDeviceInfo;
                Context context = (Context) u00Var.b;
                o00 o00Var = (o00) u00Var.w;
                List j = u00Var.j();
                y79 y79Var = r00.e;
                u00Var.k(r00.b(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), o00Var, audioDeviceInfo, j));
                return;
            case 5:
                o1 o1Var = (o1) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                v70 v70Var = (v70) o1Var.b;
                if (arrayList2.isEmpty()) {
                    return;
                }
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    v70Var.getMessagesController().P4(v70Var.Z() * 60, ((Long) arrayList2.get(i10)).longValue());
                }
                if (v70Var.Z() > 0) {
                    b10.u(jb6.a0("AutodeleteTimerEnabledForChats", null, 2131753743, jb6.c0(v70Var.Z() * 60), jb6.G(arrayList2.size(), "Chats", Integer.valueOf(arrayList2.size()))), c41.b0(v70Var), R.raw.fire_on, 36);
                    return;
                } else {
                    c41.b0(v70Var).Q(R.raw.fire_off, 36, jb6.a0("AutodeleteTimerDisabledForChats", null, 2131753744, jb6.G(arrayList2.size(), "Chats", Integer.valueOf(arrayList2.size())))).j();
                    return;
                }
            case 6:
                kp kpVar = (kp) this.b;
                Object apply = ((b74) this.c).apply(kpVar.f);
                kpVar.f = apply;
                xe0 xe0Var = new xe0(kpVar, apply, (byte) 1);
                dfb dfbVar = (dfb) kpVar.c;
                if (dfbVar.a.getLooper().getThread().isAlive()) {
                    dfbVar.e(xe0Var);
                    return;
                }
                return;
            case 7:
                oi0 oi0Var = (oi0) this.b;
                File file3 = (File) this.c;
                if (file3 == null) {
                    oi0Var.j = false;
                    nm7.e().k(nm7.U4, new Object[0]);
                    return;
                }
                if (!TextUtils.isEmpty(oi0Var.d)) {
                    try {
                        new File(oi0Var.d).delete();
                    } catch (Exception e) {
                        fc4.g(e, true);
                    }
                }
                oi0Var.d = file3.getAbsolutePath();
                oi0Var.f();
                oi0Var.k = 1.0f;
                oi0Var.j = false;
                nm7.e().k(nm7.U4, new Object[0]);
                return;
            case 8:
                ok0 ok0Var = (ok0) this.b;
                TLObject tLObject = (TLObject) this.c;
                int i11 = ok0Var.a;
                if (tLObject instanceof TL_account.contactBirthdays) {
                    ok0Var.b = System.currentTimeMillis();
                    TL_account.contactBirthdays contactbirthdays = (TL_account.contactBirthdays) tLObject;
                    ok0Var.c = mk0.b(contactbirthdays);
                    oc7.r1(i11).d4(contactbirthdays.users, false);
                    cf7.Y(i11).j1(contactbirthdays.users, null, true, true);
                    SharedPreferences.Editor edit = oc7.r1(i11).X3.edit();
                    edit.putLong("bday_check", ok0Var.b);
                    nk0 nk0Var = new nk0();
                    nk0Var.a = contactbirthdays.contacts;
                    SerializedData serializedData = new SerializedData(nk0Var.getObjectSize());
                    nk0Var.serializeToStream(serializedData);
                    edit.putString("bday_contacts", Utilities.f(serializedData.toByteArray()));
                    edit.apply();
                    nm7.f(i11).k(nm7.k5, new Object[0]);
                    ok0Var.e = false;
                    return;
                }
                return;
            case 9:
                ((y0a) this.b).a((ArrayList) this.c);
                return;
            case 10:
                ((to0) this.b).a((TLRPC.TL_error) this.c);
                return;
            case 11:
                ((u35) this.b).a((ArrayList) this.c);
                return;
            case 12:
                cf7 cf7Var = (cf7) this.b;
                qac qacVar = (qac) this.c;
                HashMap f0 = cf7Var.f0();
                if (f0.isEmpty()) {
                    return;
                }
                gm.c3(new ug(qacVar, f0, (byte) 1));
                return;
            case 13:
                u31 I = c41.b0((yv1) this.b).I(R.raw.stars_send, jb6.M0(2131744781, null), gm.S2(jb6.H(',', "StarsGiveawaySentPopupInfo", (int) ((TL_stars.TL_starsGiveawayOption) this.c).stars)));
                I.j = 5000;
                I.k(true);
                return;
            case 14:
                nm7.f(z8c.t0).k(nm7.X2, ((ap0) this.b).W1, Boolean.TRUE, (TL_stories.PrepaidGiveaway) this.c);
                return;
            case 15:
                lp0 lp0Var = (lp0) this.b;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) this.c;
                lp0Var.U = tL_premium_boostsStatus;
                if (tL_premium_boostsStatus != null) {
                    lp0Var.getMessagesController().F0().b(lp0Var.S, lp0Var.U, new cp0(lp0Var, (byte) 0));
                }
                lp0Var.i0.animate().cancel();
                lp0Var.i0.animate().alpha(0.0f).setDuration(100L).setStartDelay(0L).setListener(new g0(lp0Var, (byte) 23));
                lp0Var.I0(true);
                lp0Var.J0(true);
                lp0Var.H0(null);
                return;
            case 16:
                ks0 ks0Var = (ks0) this.b;
                String str4 = (String) this.c;
                ArrayList arrayList3 = ks0Var.f;
                int i12 = 0;
                while (true) {
                    if (i12 >= arrayList3.size()) {
                        i12 = -1;
                    } else if (!TextUtils.equals(((t3b) arrayList3.get(i12)).E, str4)) {
                        i12++;
                    }
                }
                if (i12 >= 0) {
                    ks0Var.r.e(str4.hashCode(), i12 + 1);
                    return;
                }
                return;
            case 17:
                hu0 hu0Var = (hu0) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                int i13 = hu0Var.a;
                ArrayList arrayList4 = hu0Var.e;
                hu0Var.i = 0;
                if (tLObject2 instanceof TL_payments.connectedStarRefBots) {
                    TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject2;
                    oc7.r1(i13).d4(connectedstarrefbots.users, false);
                    if (hu0Var.c <= 0) {
                        arrayList4.clear();
                    }
                    hu0Var.c = connectedstarrefbots.count;
                    arrayList4.addAll(connectedstarrefbots.connected_bots);
                    hu0Var.d = connectedstarrefbots.connected_bots.isEmpty() || arrayList4.size() >= hu0Var.c;
                    i = 1;
                } else {
                    i = 1;
                    hu0Var.h = true;
                    hu0Var.d = true;
                }
                hu0Var.g = false;
                nm7 f = nm7.f(i13);
                Object[] objArr = new Object[i];
                objArr[0] = Long.valueOf(hu0Var.b);
                f.k(nm7.O3, objArr);
                return;
            case 18:
                iu0 iu0Var = (iu0) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                int i14 = iu0Var.a;
                ArrayList arrayList5 = iu0Var.e;
                if (tLObject3 instanceof TL_payments.suggestedStarRefBots) {
                    TL_payments.suggestedStarRefBots suggestedstarrefbots = (TL_payments.suggestedStarRefBots) tLObject3;
                    oc7.r1(i14).d4(suggestedstarrefbots.users, false);
                    if (iu0Var.c <= 0) {
                        arrayList5.clear();
                    }
                    iu0Var.c = suggestedstarrefbots.count;
                    arrayList5.addAll(suggestedstarrefbots.suggested_bots);
                    iu0Var.j = suggestedstarrefbots.next_offset;
                    iu0Var.d = suggestedstarrefbots.suggested_bots.isEmpty() || arrayList5.size() >= iu0Var.c;
                    i2 = 1;
                } else {
                    i2 = 1;
                    iu0Var.i = true;
                    iu0Var.d = true;
                }
                iu0Var.h = false;
                nm7 f2 = nm7.f(i14);
                Object[] objArr2 = new Object[i2];
                objArr2[0] = Long.valueOf(iu0Var.b);
                f2.k(nm7.N3, objArr2);
                return;
            case 19:
                qw0 qw0Var2 = (qw0) this.b;
                ow0 ow0Var = (ow0) this.c;
                up0 up0Var = qw0Var2.k0;
                up0Var.f = true;
                up0Var.i();
                qw0Var2.s(ow0Var);
                return;
            case 20:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) this.b;
                ArrayList arrayList6 = (ArrayList) this.c;
                if (botWebViewContainer$BotWebViewProxy == null || (qw0Var = botWebViewContainer$BotWebViewProxy.a) == null || (uv0Var = qw0Var.c) == null) {
                    return;
                }
                uv0Var.f(arrayList6);
                return;
            case 21:
                wx0 wx0Var = (wx0) this.b;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.c;
                if (userFull == null || (botInfo = userFull.bot_info) == null || (botappsettings = botInfo.app_settings) == null) {
                    return;
                }
                wx0Var.g(botappsettings, true);
                return;
            case 22:
                wx0 wx0Var2 = (wx0) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                if (wx0Var2.e0) {
                    return;
                }
                if (tL_error != null) {
                    wx0Var2.m(false);
                    return;
                } else {
                    gm.d3(wx0Var2.v0, 60000L);
                    return;
                }
            case 23:
                wx0 wx0Var3 = (wx0) this.b;
                u31 Q = new c41(wx0Var3.r0, wx0Var3.G).Q(R.raw.contact_check, 36, gm.S2((String) this.c));
                Q.j = 5000;
                Q.k(true);
                return;
            case 24:
                w01 w01Var2 = (w01) this.b;
                m01 m01Var = (m01) this.c;
                if (w01Var2.d.get(Long.valueOf(m01Var.a)) == m01Var && m01Var.h == null && w01Var2.c == 2) {
                    w01Var2.p(m01Var);
                    return;
                }
                return;
            case 25:
                w01 w01Var3 = (w01) this.b;
                r01 r01Var = (r01) this.c;
                if (w01Var3.P.contains(r01Var)) {
                    w01Var3.q(r01Var);
                    return;
                }
                return;
            case 26:
                f11 f11Var = (f11) this.b;
                ArrayList arrayList7 = (ArrayList) this.c;
                d11 d11Var = f11Var.i;
                d11Var.getClass();
                ArrayList arrayList8 = new ArrayList(arrayList7);
                Collections.sort(arrayList8, new sa((byte) 10));
                HashSet hashSet = new HashSet();
                int size8 = arrayList8.size();
                int i15 = 0;
                while (i15 < size8) {
                    Object obj = arrayList8.get(i15);
                    i15++;
                    t01 t01Var = (t01) obj;
                    if (hashSet.size() >= 4) {
                        HashSet hashSet2 = new HashSet();
                        size = arrayList7.size();
                        i3 = 0;
                        while (i3 < size) {
                            Object obj2 = arrayList7.get(i3);
                            i3++;
                            hashSet2.add(((t01) obj2).a);
                        }
                        it = hashSet.iterator();
                        while (it.hasNext()) {
                            String str5 = (String) it.next();
                            if (!d11Var.d.contains(str5)) {
                                Long l = (Long) d11Var.g.get(str5);
                                d11Var.i.put(str5, Long.valueOf(l != null ? l.longValue() + 1 : Long.MIN_VALUE));
                                d11Var.j.remove(str5);
                            }
                        }
                        d11Var.d = hashSet;
                        ArrayList arrayList9 = new ArrayList(d11Var.b.keySet());
                        size2 = arrayList9.size();
                        i4 = 0;
                        while (i4 < size2) {
                            Object obj3 = arrayList9.get(i4);
                            i4++;
                            String str6 = (String) obj3;
                            if (!hashSet.contains(str6)) {
                                boolean contains = hashSet2.contains(str6);
                                HashSet hashSet3 = d11Var.j;
                                if (contains) {
                                    hashSet3.add(str6);
                                } else {
                                    hashSet3.remove(str6);
                                    d11Var.h.remove(str6);
                                    d11Var.i.remove(str6);
                                    d11Var.e(str6);
                                }
                            }
                        }
                        ArrayList arrayList10 = new ArrayList(d11Var.g.keySet());
                        size3 = arrayList10.size();
                        i5 = 0;
                        while (i5 < size3) {
                            Object obj4 = arrayList10.get(i5);
                            i5++;
                            String str7 = (String) obj4;
                            if (!hashSet2.contains(str7)) {
                                d11Var.g.remove(str7);
                            }
                        }
                        w01Var = f11Var.d;
                        ArrayList arrayList11 = w01Var.P;
                        HashMap hashMap2 = new HashMap();
                        ArrayList arrayList12 = w01Var.H;
                        size4 = arrayList12.size();
                        i6 = 0;
                        while (i6 < size4) {
                            Object obj5 = arrayList12.get(i6);
                            i6++;
                            t01 t01Var2 = (t01) obj5;
                            hashMap2.put(t01Var2.a, Integer.valueOf(t01Var2.b));
                        }
                        arrayList12.clear();
                        arrayList12.addAll(arrayList7);
                        size5 = arrayList12.size();
                        i7 = 0;
                        while (i7 < size5) {
                            Object obj6 = arrayList12.get(i7);
                            i7++;
                            t01 t01Var3 = (t01) obj6;
                            Integer num = (Integer) hashMap2.get(t01Var3.a);
                            if (num != null && t01Var3.b > num.intValue()) {
                                String str8 = t01Var3.a;
                                l01 l01Var = w01Var.a;
                                int indexOf = arrayList12.indexOf(w01Var.l(str8));
                                if (indexOf >= 0) {
                                    int i16 = w01Var.h()[indexOf];
                                    ArrayList arrayList13 = new ArrayList();
                                    q01 q01Var = w01Var.L;
                                    if (q01Var != null && q01Var.b > l01Var.h()) {
                                        arrayList13.add((s01) w01Var.L.e);
                                    }
                                    arrayList13.addAll(w01Var.G);
                                    int size9 = arrayList13.size();
                                    int i17 = i9;
                                    while (i17 < size9) {
                                        Object obj7 = arrayList13.get(i17);
                                        i17++;
                                        s01 s01Var = (s01) obj7;
                                        ArrayList arrayList14 = s01Var.f;
                                        boolean z3 = z2;
                                        int size10 = arrayList14.size();
                                        int i18 = 0;
                                        while (i18 < size10) {
                                            Object obj8 = arrayList14.get(i18);
                                            i18++;
                                            int i19 = size5;
                                            v01 v01Var = (v01) obj8;
                                            HashMap hashMap3 = hashMap2;
                                            if (v01Var.a.equals(str8) && v01Var.c < i16) {
                                                r01 r01Var2 = new r01(s01Var, str8, v01Var.b, i16);
                                                arrayList11.add(r01Var2);
                                                w01Var.q(r01Var2);
                                            }
                                            size5 = i19;
                                            hashMap2 = hashMap3;
                                        }
                                        z2 = z3;
                                    }
                                    i8 = size5;
                                    hashMap = hashMap2;
                                    z = z2;
                                    StringBuilder p = wi8.p("ceiling raised for ", str8, ": re-fetching ");
                                    p.append(arrayList11.size());
                                    p.append(" parts at q");
                                    p.append(i16);
                                    l01Var.d(p.toString());
                                    size5 = i8;
                                    z2 = z;
                                    hashMap2 = hashMap;
                                    i9 = 0;
                                }
                            }
                            i8 = size5;
                            hashMap = hashMap2;
                            z = z2;
                            size5 = i8;
                            z2 = z;
                            hashMap2 = hashMap;
                            i9 = 0;
                        }
                        for (size6 = arrayList11.size() - 1; size6 >= 0; size6--) {
                            if (w01Var.l(((r01) arrayList11.get(size6)).b) == null) {
                                w01Var.f((r01) arrayList11.remove(size6));
                            }
                        }
                        it2 = w01Var.d.values().iterator();
                        while (it2.hasNext()) {
                            Iterator it3 = ((m01) it2.next()).k.entrySet().iterator();
                            while (it3.hasNext()) {
                                u01 u01Var = (u01) ((Map.Entry) it3.next()).getValue();
                                if (w01Var.l(u01Var.a) == null) {
                                    w01Var.g(u01Var);
                                    it3.remove();
                                }
                            }
                        }
                        if (w01Var.c != 2) {
                            w01Var.j();
                            w01Var.w();
                            return;
                        }
                        return;
                    }
                    if (t01Var.b >= 1 && !d11Var.c.contains(t01Var.a)) {
                        hashSet.add(t01Var.a);
                    }
                }
                HashSet hashSet22 = new HashSet();
                size = arrayList7.size();
                i3 = 0;
                while (i3 < size) {
                }
                it = hashSet.iterator();
                while (it.hasNext()) {
                }
                d11Var.d = hashSet;
                ArrayList arrayList92 = new ArrayList(d11Var.b.keySet());
                size2 = arrayList92.size();
                i4 = 0;
                while (i4 < size2) {
                }
                ArrayList arrayList102 = new ArrayList(d11Var.g.keySet());
                size3 = arrayList102.size();
                i5 = 0;
                while (i5 < size3) {
                }
                w01Var = f11Var.d;
                ArrayList arrayList112 = w01Var.P;
                HashMap hashMap22 = new HashMap();
                ArrayList arrayList122 = w01Var.H;
                size4 = arrayList122.size();
                i6 = 0;
                while (i6 < size4) {
                }
                arrayList122.clear();
                arrayList122.addAll(arrayList7);
                size5 = arrayList122.size();
                i7 = 0;
                while (i7 < size5) {
                }
                while (size6 >= 0) {
                }
                it2 = w01Var.d.values().iterator();
                while (it2.hasNext()) {
                }
                if (w01Var.c != 2) {
                }
                break;
            case 27:
                a();
                return;
            case 28:
                ((o01) this.b).b((n01) this.c);
                return;
            default:
                ArrayList arrayList15 = (ArrayList) this.b;
                LongSparseArray longSparseArray = (LongSparseArray) this.c;
                crd.c.addAll(0, arrayList15);
                for (int i20 = 0; i20 < longSparseArray.size(); i20++) {
                    crd.d.put(longSparseArray.keyAt(i20), (m11) longSparseArray.valueAt(i20));
                }
                crd.b = true;
                crd.a = false;
                ArrayList arrayList16 = crd.e;
                if (arrayList16 != null) {
                    int size11 = arrayList16.size();
                    while (i9 < size11) {
                        Object obj9 = arrayList16.get(i9);
                        i9++;
                        ((qac) obj9).a(arrayList15);
                    }
                    crd.e = null;
                    return;
                }
                return;
        }
    }
}
