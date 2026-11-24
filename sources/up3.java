// default package

import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build;
import android.util.Pair;
import android.util.SparseArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class up3 extends pf0 implements gk7 {
    public static volatile up3[] U = new up3[4];
    public int E;
    public boolean F;
    public final vf6 G;
    public final ArrayList H;
    public final ArrayList I;
    public final SparseArray J;
    public final tp3 K;
    public final tp3 L;
    public final tp3 M;
    public final tp3 N;
    public final tp3 O;
    public final tp3 P;
    public int Q;
    public int R;
    public int S;
    public final o1 T;
    public int a;
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList d;
    public final ArrayList e;
    public final HashMap f;
    public final HashMap h;
    public final HashMap n;
    public final HashMap r;
    public final SparseArray s;
    public boolean w;
    public final HashMap x;
    public final ArrayList y;

    /* JADX WARN: Removed duplicated region for block: B:33:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public up3(int i) {
        super(i);
        byte b;
        Object obj;
        this.a = 0;
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new HashMap();
        this.h = new HashMap();
        this.n = new HashMap();
        this.r = new HashMap();
        this.s = new SparseArray();
        this.w = false;
        this.x = new HashMap();
        this.y = new ArrayList();
        this.E = 0;
        this.G = new vf6();
        this.H = new ArrayList();
        this.I = new ArrayList();
        this.J = new SparseArray();
        this.T = new o1(this, (byte) 25);
        SharedPreferences sharedPreferences = na7.q1(this.currentAccount).X3;
        tp3 tp3Var = new tp3(sharedPreferences.getString("preset0", "1_1_1_1_1048576_512000_512000_524288_0_0_1_1_50_0"), "1_1_1_1_1048576_512000_512000_524288_0_0_1_1_50_0");
        this.K = tp3Var;
        tp3Var.e = false;
        this.L = new tp3(sharedPreferences.getString("preset1", "13_13_13_13_1048576_10485760_1048576_524288_1_1_1_0_100_1"), "13_13_13_13_1048576_10485760_1048576_524288_1_1_1_0_100_1");
        this.M = new tp3(sharedPreferences.getString("preset2", "13_13_13_13_1048576_15728640_3145728_524288_1_1_1_0_100_1"), "13_13_13_13_1048576_15728640_3145728_524288_1_1_1_0_100_1");
        boolean contains = sharedPreferences.contains("newConfig");
        if (contains || !getUserConfig().o()) {
            this.N = new tp3(sharedPreferences.getString("mobilePreset", "13_13_13_13_1048576_10485760_1048576_524288_1_1_1_0_100_1"), "13_13_13_13_1048576_10485760_1048576_524288_1_1_1_0_100_1");
            this.O = new tp3(sharedPreferences.getString("wifiPreset", "13_13_13_13_1048576_15728640_3145728_524288_1_1_1_0_100_1"), "13_13_13_13_1048576_15728640_3145728_524288_1_1_1_0_100_1");
            this.P = new tp3(sharedPreferences.getString("roamingPreset", "1_1_1_1_1048576_512000_512000_524288_0_0_1_1_50_0"), "1_1_1_1_1048576_512000_512000_524288_0_0_1_1_50_0");
            this.Q = sharedPreferences.getInt("currentMobilePreset", 3);
            this.R = sharedPreferences.getInt("currentWifiPreset", 3);
            this.S = sharedPreferences.getInt("currentRoamingPreset", 3);
            if (!contains) {
                b = 1;
                sharedPreferences.edit().putBoolean("newConfig", true).commit();
                gl.c3(new rp3(this, b));
                zj zjVar = new zj(this, (byte) 4);
                IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
                if (Build.VERSION.SDK_INT < 33) {
                    a.b.registerReceiver(zjVar, intentFilter, 4);
                } else {
                    a.b.registerReceiver(zjVar, intentFilter);
                }
                if (getUserConfig().o()) {
                    return;
                }
                g();
                return;
            }
        } else {
            int[] iArr = new int[4];
            int[] iArr2 = new int[4];
            int[] iArr3 = new int[4];
            long[] jArr = new long[7];
            long[] jArr2 = new long[7];
            long[] jArr3 = new long[7];
            int i2 = 0;
            for (int i3 = 4; i2 < i3; i3 = 4) {
                int i4 = i2;
                StringBuilder sb = new StringBuilder("mobileDataDownloadMask");
                Object obj2 = "";
                if (i4 == 0) {
                    obj = "";
                } else {
                    obj = "";
                    obj2 = Integer.valueOf(i4);
                }
                sb.append(obj2);
                String sb2 = sb.toString();
                if (i4 == 0 || sharedPreferences.contains(sb2)) {
                    iArr[i4] = sharedPreferences.getInt(sb2, 13);
                    StringBuilder sb3 = new StringBuilder("wifiDownloadMask");
                    sb3.append(i4 == 0 ? obj : Integer.valueOf(i4));
                    iArr2[i4] = sharedPreferences.getInt(sb3.toString(), 13);
                    StringBuilder sb4 = new StringBuilder("roamingDownloadMask");
                    sb4.append(i4 == 0 ? obj : Integer.valueOf(i4));
                    iArr3[i4] = sharedPreferences.getInt(sb4.toString(), 1);
                } else {
                    iArr[i4] = iArr[0];
                    iArr2[i4] = iArr2[0];
                    iArr3[i4] = iArr3[0];
                }
                i2 = i4 + 1;
            }
            jArr[2] = sharedPreferences.getLong("mobileMaxDownloadSize2", this.L.b[1]);
            jArr[3] = sharedPreferences.getLong("mobileMaxDownloadSize3", this.L.b[2]);
            jArr2[2] = sharedPreferences.getLong("wifiMaxDownloadSize2", this.M.b[1]);
            jArr2[3] = sharedPreferences.getLong("wifiMaxDownloadSize3", this.M.b[2]);
            jArr3[2] = sharedPreferences.getLong("roamingMaxDownloadSize2", this.K.b[1]);
            jArr3[3] = sharedPreferences.getLong("roamingMaxDownloadSize3", this.K.b[2]);
            boolean z = sharedPreferences.getBoolean("globalAutodownloadEnabled", true);
            tp3 tp3Var2 = new tp3(iArr, this.L.b[0], jArr[2], jArr[3], true, true, z, false, 100, false);
            this.N = tp3Var2;
            tp3 tp3Var3 = new tp3(iArr2, this.M.b[0], jArr2[2], jArr2[3], true, true, z, false, 100, true);
            this.O = tp3Var3;
            tp3 tp3Var4 = new tp3(iArr3, this.K.b[0], jArr3[2], jArr3[3], false, false, z, true, 50, true);
            this.P = tp3Var4;
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putBoolean("newConfig", true);
            edit.putString("mobilePreset", tp3Var2.toString());
            edit.putString("wifiPreset", tp3Var3.toString());
            edit.putString("roamingPreset", tp3Var4.toString());
            this.Q = 3;
            edit.putInt("currentMobilePreset", 3);
            this.R = 3;
            edit.putInt("currentWifiPreset", 3);
            this.S = 3;
            edit.putInt("currentRoamingPreset", 3);
            edit.commit();
        }
        b = 1;
        gl.c3(new rp3(this, b));
        zj zjVar2 = new zj(this, (byte) 4);
        IntentFilter intentFilter2 = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        if (Build.VERSION.SDK_INT < 33) {
        }
        if (getUserConfig().o()) {
        }
    }

    public static up3 q(int i) {
        up3 up3Var;
        up3 up3Var2 = U[i];
        if (up3Var2 != null) {
            return up3Var2;
        }
        synchronized (up3.class) {
            up3Var = U[i];
            if (up3Var == null) {
                up3[] up3VarArr = U;
                up3 up3Var3 = new up3(i);
                up3VarArr[i] = up3Var3;
                up3Var = up3Var3;
            }
        }
        return up3Var;
    }

    public static float r(long[] jArr) {
        if (jArr.length < 2) {
            return 0.0f;
        }
        long j = jArr[1];
        if (j != 0) {
            return Math.min(1.0f, jArr[0] / j);
        }
        return 0.0f;
    }

    public static int x(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 2;
        }
        if (i == 4) {
            return 1;
        }
        return i == 8 ? 2 : 0;
    }

    public final void a(String str, k27 k27Var, sp3 sp3Var) {
        if (this.w) {
            this.x.put(str, sp3Var);
            return;
        }
        v(sp3Var);
        HashMap hashMap = this.n;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            hashMap.put(str, arrayList);
        }
        arrayList.add(new WeakReference(sp3Var));
        if (k27Var != null) {
            HashMap hashMap2 = this.r;
            ArrayList arrayList2 = (ArrayList) hashMap2.get(str);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                hashMap2.put(str, arrayList2);
            }
            arrayList2.add(k27Var);
        }
        this.s.put(sp3Var.getObserverTag(), str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
    
        if (getContactsController().g0.containsKey(java.lang.Long.valueOf(r5.user_id)) != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0088, code lost:
    
        if (getContactsController().g0.containsKey(java.lang.Long.valueOf(r14.from_id.user_id)) != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00c5, code lost:
    
        if (getContactsController().g0.containsKey(java.lang.Long.valueOf(r14.from_id.user_id)) != false) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(TLRPC.Message message) {
        int i;
        char c;
        int e;
        tp3 n;
        if (message == null || (message.media instanceof TLRPC.TL_messageMediaStory)) {
            return f() ? 2 : 0;
        }
        boolean K4 = k27.K4(message);
        if (K4 || k27.t3(message) || k27.i4(message) || (k27.n1(message) instanceof TLRPC.TL_messageMediaGame)) {
            i = 4;
        } else if (k27.Q4(message)) {
            i = 2;
        } else {
            if (!k27.R3(message) && !k27.v4(message) && !k27.L2(message)) {
                if (k27.G0(message) != null) {
                    i = 8;
                }
            }
            i = 1;
        }
        TLRPC.Peer peer = message.peer_id;
        if (peer != null) {
            if (peer.user_id == 0) {
                if (peer.chat_id != 0) {
                    if (message.from_id instanceof TLRPC.TL_peerUser) {
                    }
                    c = 2;
                } else {
                    TLRPC.Chat K0 = peer.channel_id != 0 ? getMessagesController().K0(Long.valueOf(message.peer_id.channel_id)) : null;
                    if (hc2.T(K0) && K0.megagroup) {
                        if (message.from_id instanceof TLRPC.TL_peerUser) {
                        }
                        c = 2;
                    } else {
                        c = 3;
                    }
                }
                e = a.e();
                if (e == 1) {
                    if (this.O.g) {
                        n = p();
                        int i2 = n.a[c];
                        long[] jArr = n.b;
                        long max = i == 2 ? Math.max(524288L, jArr[x(i)]) : jArr[x(i)];
                        long p1 = k27.p1(k27.n1(message));
                        if (K4 || !n.c || p1 <= max || max <= 2097152) {
                            if ((i != 1 || (p1 != 0 && p1 <= max)) && (i == 2 || (i2 & i) != 0)) {
                                return 1;
                            }
                        } else if ((i2 & i) != 0) {
                        }
                    }
                }
                if (e == 2) {
                    if (this.P.g) {
                        n = o();
                        int i22 = n.a[c];
                        long[] jArr2 = n.b;
                        if (i == 2) {
                        }
                        long p12 = k27.p1(k27.n1(message));
                        if (K4) {
                        }
                        if (i != 1) {
                        }
                        return 1;
                    }
                }
                if (this.N.g) {
                    n = n();
                    int i222 = n.a[c];
                    long[] jArr22 = n.b;
                    if (i == 2) {
                    }
                    long p122 = k27.p1(k27.n1(message));
                    if (K4) {
                    }
                    if (i != 1) {
                    }
                    return 1;
                }
            }
            c = 0;
            e = a.e();
            if (e == 1) {
            }
        }
        c = 1;
        e = a.e();
        if (e == 1) {
        }
    }

    public final boolean c(int i, long j) {
        tp3 n;
        int e = a.e();
        if (e == 1) {
            if (!this.O.g) {
                return false;
            }
            n = p();
        } else if (e == 2) {
            if (!this.P.g) {
                return false;
            }
            n = o();
        } else {
            if (!this.N.g) {
                return false;
            }
            n = n();
        }
        int i2 = n.a[1];
        long j2 = n.b[x(i)];
        if (i == 1 || (j != 0 && j <= j2)) {
            return i == 2 || (i2 & i) != 0;
        }
        return false;
    }

    public final boolean d(k27 k27Var) {
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        if (k27Var.D == 23) {
            boolean z = gba.a;
            return (!e66.e(1024) || (storyItem = ((TLRPC.TL_messageMediaStory) k27.m1(k27Var)).storyItem) == null || (messageMedia = storyItem.media) == null || messageMedia.document == null || !storyItem.isPublic) ? false : true;
        }
        if (k27Var.a1 != null) {
            return true;
        }
        return !k27Var.x3() && e(k27Var) == 1;
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        vf6 vf6Var = this.G;
        int i3 = kk7.Y1;
        SparseArray sparseArray = this.s;
        HashMap hashMap = this.n;
        if (i == i3 || i == kk7.R1) {
            String str = (String) objArr[0];
            Integer num = (Integer) objArr[1];
            this.w = true;
            ArrayList arrayList = (ArrayList) hashMap.get(str);
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    WeakReference weakReference = (WeakReference) arrayList.get(i4);
                    if (weakReference.get() != null) {
                        ((sp3) weakReference.get()).B(num.intValue() == 1);
                        if (num.intValue() != 1) {
                            sparseArray.remove(((sp3) weakReference.get()).getObserverTag());
                        }
                    }
                }
                if (num.intValue() != 1) {
                    hashMap.remove(str);
                }
            }
            this.w = false;
            u();
            h(num.intValue(), str);
            return;
        }
        if (i == kk7.X1 || i == kk7.Q1) {
            this.w = true;
            String str2 = (String) objArr[0];
            HashMap hashMap2 = this.r;
            ArrayList arrayList2 = (ArrayList) hashMap2.get(str2);
            if (arrayList2 != null) {
                int size2 = arrayList2.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    ((k27) arrayList2.get(i5)).z0 = true;
                }
                hashMap2.remove(str2);
            }
            ArrayList arrayList3 = (ArrayList) hashMap.get(str2);
            if (arrayList3 != null) {
                int size3 = arrayList3.size();
                for (int i6 = 0; i6 < size3; i6++) {
                    WeakReference weakReference2 = (WeakReference) arrayList3.get(i6);
                    if (weakReference2.get() != null) {
                        ((sp3) weakReference2.get()).N(str2);
                        sparseArray.remove(((sp3) weakReference2.get()).getObserverTag());
                    }
                }
                hashMap.remove(str2);
            }
            this.w = false;
            u();
            h(0, str2);
            return;
        }
        if (i == kk7.W1) {
            this.w = true;
            ArrayList arrayList4 = (ArrayList) hashMap.get((String) objArr[0]);
            if (arrayList4 != null) {
                Long l = (Long) objArr[1];
                Long l2 = (Long) objArr[2];
                int size4 = arrayList4.size();
                for (int i7 = 0; i7 < size4; i7++) {
                    WeakReference weakReference3 = (WeakReference) arrayList4.get(i7);
                    if (weakReference3.get() != null) {
                        ((sp3) weakReference3.get()).i(l.longValue(), l2.longValue());
                    }
                }
            }
            this.w = false;
            u();
            return;
        }
        if (i == kk7.V1) {
            this.w = true;
            String str3 = (String) objArr[0];
            ArrayList arrayList5 = (ArrayList) hashMap.get(str3);
            if (arrayList5 != null) {
                Long l3 = (Long) objArr[1];
                Long l4 = (Long) objArr[2];
                Boolean bool = (Boolean) objArr[3];
                int size5 = arrayList5.size();
                for (int i8 = 0; i8 < size5; i8++) {
                    WeakReference weakReference4 = (WeakReference) arrayList5.get(i8);
                    if (weakReference4.get() != null) {
                        sp3 sp3Var = (sp3) weakReference4.get();
                        long longValue = l3.longValue();
                        long longValue2 = l4.longValue();
                        bool.getClass();
                        sp3Var.l(longValue, longValue2);
                    }
                }
            }
            this.w = false;
            u();
            try {
                ArrayList arrayList6 = (ArrayList) getSendMessagesHelper().a.get(str3);
                if (arrayList6 != null) {
                    for (int i9 = 0; i9 < arrayList6.size(); i9++) {
                        k3a k3aVar = (k3a) arrayList6.get(i9);
                        if (k3aVar.n == null) {
                            long j = k3aVar.a;
                            Long l5 = (Long) vf6Var.f(j);
                            if (k3aVar.e != 4) {
                                k3aVar.m.F0();
                                if (l5 == null || l5.longValue() + 4000 < System.currentTimeMillis()) {
                                    if (k3aVar.m.g4()) {
                                        getMessagesController().H4(8, 0, j, 0L, null);
                                    } else if (k27.K4(k3aVar.m.k)) {
                                        getMessagesController().H4(5, 0, j, 0L, null);
                                    } else if (k27.Q4(k3aVar.m.k)) {
                                        getMessagesController().H4(9, 0, j, 0L, null);
                                    } else if (k3aVar.m.F0() != null) {
                                        getMessagesController().H4(3, 0, j, 0L, null);
                                    } else if (k3aVar.g != null) {
                                        getMessagesController().H4(4, 0, j, 0L, null);
                                    }
                                    vf6Var.k(Long.valueOf(System.currentTimeMillis()), j);
                                }
                            } else if (l5 == null || l5.longValue() + 4000 < System.currentTimeMillis()) {
                                k27 k27Var = (k27) k3aVar.E.get(str3 + "_i");
                                if (k27Var != null) {
                                    if (k27.K4(k27Var.k)) {
                                        getMessagesController().H4(5, 0, j, 0L, null);
                                    } else if (k27Var.F0() != null) {
                                        getMessagesController().H4(3, 0, j, 0L, null);
                                    }
                                    vf6Var.k(Long.valueOf(System.currentTimeMillis()), j);
                                }
                                getMessagesController().H4(4, 0, j, 0L, null);
                                vf6Var.k(Long.valueOf(System.currentTimeMillis()), j);
                            }
                        }
                    }
                }
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
    
        if (getContactsController().g0.containsKey(java.lang.Long.valueOf(r6.user_id)) != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0094, code lost:
    
        if (getContactsController().g0.containsKey(java.lang.Long.valueOf(r1.from_id.user_id)) != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00d1, code lost:
    
        if (getContactsController().g0.containsKey(java.lang.Long.valueOf(r1.from_id.user_id)) != false) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(k27 k27Var) {
        TLRPC.Message message;
        int i;
        char c;
        int e;
        tp3 n;
        jbc jbcVar;
        long p1;
        if (k27Var != null && (message = k27Var.k) != null) {
            if (!(message.media instanceof TLRPC.TL_messageMediaStory)) {
                boolean K4 = k27.K4(message);
                if (K4 || k27.t3(message) || k27.i4(message) || (k27.n1(message) instanceof TLRPC.TL_messageMediaGame)) {
                    i = 4;
                } else if (k27.Q4(message)) {
                    i = 2;
                } else if (k27.R3(message) || k27.v4(message) || k27.L2(message)) {
                    i = 1;
                } else if (k27.G0(message) != null) {
                    i = 8;
                }
                TLRPC.Peer peer = message.peer_id;
                if (peer != null) {
                    if (peer.user_id == 0) {
                        if (peer.chat_id != 0) {
                            if (message.from_id instanceof TLRPC.TL_peerUser) {
                            }
                            c = 2;
                        } else {
                            TLRPC.Chat K0 = peer.channel_id != 0 ? getMessagesController().K0(Long.valueOf(message.peer_id.channel_id)) : null;
                            if (hc2.T(K0) && K0.megagroup) {
                                if (message.from_id instanceof TLRPC.TL_peerUser) {
                                }
                                c = 2;
                            } else {
                                c = 3;
                            }
                        }
                        e = a.e();
                        if (e == 1) {
                            if (this.O.g) {
                                n = p();
                                int i2 = n.a[c];
                                long[] jArr = n.b;
                                long max = i == 2 ? Math.max(524288L, jArr[x(i)]) : jArr[x(i)];
                                jbcVar = k27Var.g3;
                                if (jbcVar != null) {
                                    p1 = jbcVar.g.size;
                                } else {
                                    jbc jbcVar2 = k27Var.h3;
                                    p1 = jbcVar2 != null ? jbcVar2.g.size : k27.p1(k27.n1(message));
                                }
                                if (K4 || !n.c || p1 <= max || max <= 2097152) {
                                    if ((i != 1 || (p1 != 0 && p1 <= max)) && (i == 2 || (i2 & i) != 0)) {
                                        return 1;
                                    }
                                } else if ((i2 & i) != 0) {
                                }
                            }
                        } else if (e == 2) {
                            if (this.P.g) {
                                n = o();
                                int i22 = n.a[c];
                                long[] jArr2 = n.b;
                                if (i == 2) {
                                }
                                jbcVar = k27Var.g3;
                                if (jbcVar != null) {
                                }
                                if (K4) {
                                }
                                if (i != 1) {
                                }
                                return 1;
                            }
                        } else if (this.N.g) {
                            n = n();
                            int i222 = n.a[c];
                            long[] jArr22 = n.b;
                            if (i == 2) {
                            }
                            jbcVar = k27Var.g3;
                            if (jbcVar != null) {
                            }
                            if (K4) {
                            }
                            if (i != 1) {
                            }
                            return 1;
                        }
                        return 2;
                    }
                    c = 0;
                    e = a.e();
                    if (e == 1) {
                    }
                    return 2;
                }
                c = 1;
                e = a.e();
                if (e == 1) {
                }
                return 2;
            }
            if (f()) {
                return 2;
            }
        }
        return 0;
    }

    public final boolean f() {
        tp3 n;
        int e = a.e();
        if (e == 1) {
            if (!this.O.g) {
                return false;
            }
            n = p();
        } else if (e == 2) {
            if (!this.P.g) {
                return false;
            }
            n = o();
        } else {
            if (!this.N.g) {
                return false;
            }
            n = n();
        }
        return n.e;
    }

    public final void g() {
        int i;
        int m = m();
        if (m != this.a) {
            this.a = m;
            int i2 = m & 1;
            ArrayList arrayList = this.b;
            if (i2 == 0) {
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    vp3 vp3Var = (vp3) arrayList.get(i3);
                    TLObject tLObject = vp3Var.a;
                    if (tLObject instanceof TLRPC.Photo) {
                        TLRPC.PhotoSize w = ba4.w(((TLRPC.Photo) tLObject).sizes, gl.Y0(false), false, null, false);
                        ba4 fileLoader = getFileLoader();
                        fileLoader.getClass();
                        fileLoader.e(null, null, null, w.location, null, null);
                    } else if (tLObject instanceof TLRPC.Document) {
                        getFileLoader().f((TLRPC.Document) vp3Var.a);
                    }
                }
                arrayList.clear();
            } else if (arrayList.isEmpty()) {
                t(1);
            }
            int i4 = m & 2;
            ArrayList arrayList2 = this.c;
            if (i4 == 0) {
                for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                    getFileLoader().f((TLRPC.Document) ((vp3) arrayList2.get(i5)).a);
                }
                arrayList2.clear();
            } else if (arrayList2.isEmpty()) {
                t(2);
            }
            int i6 = m & 8;
            ArrayList arrayList3 = this.d;
            if (i6 == 0) {
                for (int i7 = 0; i7 < arrayList3.size(); i7++) {
                    getFileLoader().f((TLRPC.Document) ((vp3) arrayList3.get(i7)).a);
                }
                arrayList3.clear();
            } else if (arrayList3.isEmpty()) {
                t(8);
            }
            int i8 = m & 4;
            ArrayList arrayList4 = this.e;
            if (i8 == 0) {
                for (int i9 = 0; i9 < arrayList4.size(); i9++) {
                    getFileLoader().f((TLRPC.Document) ((vp3) arrayList4.get(i9)).a);
                }
                arrayList4.clear();
            } else if (arrayList4.isEmpty()) {
                t(4);
            }
            if (this.N.g || this.P.g || this.O.g) {
                i = 0;
                for (int i10 = 0; i10 < 4; i10++) {
                    if ((n().a[i10] & 1) != 0 || (p().a[i10] & 1) != 0 || (o().a[i10] & 1) != 0) {
                        i |= 1;
                    }
                    if ((n().a[i10] & 2) != 0 || (p().a[i10] & 2) != 0 || (o().a[i10] & 2) != 0) {
                        i |= 2;
                    }
                    if ((n().a[i10] & 4) != 0 || (p().a[i10] & 4) != 0 || (o().a[i10] & 4) != 0) {
                        i |= 4;
                    }
                    if ((n().a[i10] & 8) != 0 || (p().a[i10] & 8) != 0 || (o().a[i10] & 8) != 0) {
                        i |= 8;
                    }
                }
            } else {
                i = 0;
            }
            if (i == 0) {
                getMessagesStorage().q(0);
                return;
            }
            if ((i & 1) == 0) {
                getMessagesStorage().q(1);
            }
            if ((i & 2) == 0) {
                getMessagesStorage().q(2);
            }
            if ((i & 4) == 0) {
                getMessagesStorage().q(4);
            }
            if ((i & 8) == 0) {
                getMessagesStorage().q(8);
            }
        }
    }

    public final void h(int i, String str) {
        HashMap hashMap = this.f;
        vp3 vp3Var = (vp3) hashMap.get(str);
        if (vp3Var != null) {
            hashMap.remove(str);
            this.h.remove(new Pair(Long.valueOf(vp3Var.c), Integer.valueOf(vp3Var.b)));
            if (i == 0 || i == 2) {
                ad7 messagesStorage = getMessagesStorage();
                long j = vp3Var.c;
                messagesStorage.a.c(new bb7(messagesStorage, vp3Var.b, j, (byte) 6));
            }
            int i2 = vp3Var.b;
            if (i2 == 1) {
                ArrayList arrayList = this.b;
                arrayList.remove(vp3Var);
                if (arrayList.isEmpty()) {
                    t(1);
                    return;
                }
                return;
            }
            if (i2 == 2) {
                ArrayList arrayList2 = this.c;
                arrayList2.remove(vp3Var);
                if (arrayList2.isEmpty()) {
                    t(2);
                    return;
                }
                return;
            }
            if (i2 == 4) {
                ArrayList arrayList3 = this.e;
                arrayList3.remove(vp3Var);
                if (arrayList3.isEmpty()) {
                    t(4);
                    return;
                }
                return;
            }
            if (i2 == 8) {
                ArrayList arrayList4 = this.d;
                arrayList4.remove(vp3Var);
                if (arrayList4.isEmpty()) {
                    t(8);
                }
            }
        }
    }

    public final void i(int i, long j) {
        SparseArray sparseArray = this.J;
        k27 k27Var = (k27) sparseArray.get(i);
        if (k27Var == null || k27.B0(k27Var.k) != j) {
            return;
        }
        sparseArray.remove(i);
        if (sparseArray.size() == 0) {
            getNotificationCenter().k(kk7.d5, new Object[0]);
        }
    }

    public final void j(ArrayList arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            int i2 = 0;
            while (true) {
                ArrayList arrayList2 = this.I;
                if (i2 >= arrayList2.size()) {
                    int i3 = 0;
                    while (true) {
                        ArrayList arrayList3 = this.H;
                        if (i3 >= arrayList3.size()) {
                            break;
                        }
                        if (((k27) arrayList.get(i)).e1() == ((k27) arrayList3.get(i3)).e1() && k27.B0(((k27) arrayList3.get(i3)).k) == k27.B0(((k27) arrayList.get(i)).k)) {
                            arrayList3.remove(i3);
                            break;
                        }
                        i3++;
                    }
                } else {
                    if (((k27) arrayList.get(i)).e1() == ((k27) arrayList2.get(i2)).e1() && k27.B0(((k27) arrayList2.get(i2)).k) == k27.B0(((k27) arrayList.get(i)).k)) {
                        arrayList2.remove(i2);
                        break;
                    }
                    i2++;
                }
            }
            ((k27) arrayList.get(i)).P = false;
            ba4.G(this.currentAccount).X(((k27) arrayList.get(i)).F0(), arrayList.get(i), 0, 0);
            ba4.G(this.currentAccount).f(((k27) arrayList.get(i)).F0());
        }
        getNotificationCenter().k(kk7.d5, new Object[0]);
        getMessagesStorage().a.c(new ee2(this, arrayList, (byte) 3));
    }

    public final int k() {
        int i = this.E;
        this.E = i + 1;
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int l() {
        int[] iArr;
        int i;
        int e = a.e();
        if (e != 1) {
            if (e == 2) {
                if (this.P.g) {
                    iArr = o().a;
                    int i2 = 0;
                    while (i < iArr.length) {
                    }
                    return i2;
                }
                return 0;
            }
            if (this.N.g) {
                iArr = n().a;
                int i22 = 0;
                while (i < iArr.length) {
                }
                return i22;
            }
            return 0;
        }
        if (this.O.g) {
            iArr = p().a;
            int i222 = 0;
            for (i = 0; i < iArr.length; i++) {
                int i3 = iArr[i];
                int i4 = (i3 & 1) != 0 ? 1 : 0;
                if ((i3 & 2) != 0) {
                    i4 |= 2;
                }
                if ((i3 & 4) != 0) {
                    i4 |= 4;
                }
                if ((i3 & 8) != 0) {
                    i4 |= 8;
                }
                i222 |= i4 << (i << 3);
            }
            return i222;
        }
        return 0;
    }

    public final int m() {
        int e = a.e();
        int i = 0;
        if (e == 1) {
            if (this.O.g) {
                int i2 = 0;
                while (i < 4) {
                    i2 |= p().a[i];
                    i++;
                }
                return i2;
            }
        } else if (e == 2) {
            if (this.P.g) {
                int i3 = 0;
                while (i < 4) {
                    i3 |= o().a[i];
                    i++;
                }
                return i3;
            }
        } else if (this.N.g) {
            int i4 = 0;
            while (i < 4) {
                i4 |= n().a[i];
                i++;
            }
            return i4;
        }
        return 0;
    }

    public final tp3 n() {
        int i = this.Q;
        return i == 0 ? this.K : i == 1 ? this.L : i == 2 ? this.M : this.N;
    }

    public final tp3 o() {
        int i = this.S;
        return i == 0 ? this.K : i == 1 ? this.L : i == 2 ? this.M : this.P;
    }

    public final tp3 p() {
        int i = this.R;
        return i == 0 ? this.K : i == 1 ? this.L : i == 2 ? this.M : this.O;
    }

    public final void s(boolean z) {
        if (this.F) {
            return;
        }
        if (z || Math.abs(System.currentTimeMillis() - getUserConfig().b0) >= 86400000) {
            this.F = true;
            getConnectionsManager().sendRequest(new TL_account.getAutoDownloadSettings(), new tf(this, (byte) 21));
        }
    }

    public final void t(int i) {
        int m = m();
        byte b = 1;
        if ((m & 1) != 0 && (i & 1) != 0 && this.b.isEmpty()) {
            ad7 messagesStorage = getMessagesStorage();
            messagesStorage.a.c(new kc7(messagesStorage, b, b));
        }
        if ((m & 2) != 0 && (i & 2) != 0 && this.c.isEmpty()) {
            ad7 messagesStorage2 = getMessagesStorage();
            messagesStorage2.a.c(new kc7(messagesStorage2, 2, b));
        }
        if ((m & 4) != 0 && (i & 4) != 0 && this.e.isEmpty()) {
            ad7 messagesStorage3 = getMessagesStorage();
            messagesStorage3.a.c(new kc7(messagesStorage3, 4, b));
        }
        int i2 = 8;
        if ((m & 8) == 0 || (i & 8) == 0 || !this.d.isEmpty()) {
            return;
        }
        ad7 messagesStorage4 = getMessagesStorage();
        messagesStorage4.a.c(new kc7(messagesStorage4, i2, b));
    }

    public final void u() {
        HashMap hashMap = this.x;
        for (Map.Entry entry : hashMap.entrySet()) {
            a((String) entry.getKey(), null, (sp3) entry.getValue());
        }
        hashMap.clear();
        ArrayList arrayList = this.y;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            v((sp3) obj);
        }
        arrayList.clear();
    }

    public final void v(sp3 sp3Var) {
        if (this.w) {
            this.y.add(sp3Var);
            return;
        }
        int observerTag = sp3Var.getObserverTag();
        SparseArray sparseArray = this.s;
        String str = (String) sparseArray.get(observerTag);
        if (str != null) {
            HashMap hashMap = this.n;
            ArrayList arrayList = (ArrayList) hashMap.get(str);
            if (arrayList != null) {
                int i = 0;
                while (i < arrayList.size()) {
                    WeakReference weakReference = (WeakReference) arrayList.get(i);
                    if (weakReference.get() == null || weakReference.get() == sp3Var) {
                        arrayList.remove(i);
                        i--;
                    }
                    i++;
                }
                if (arrayList.isEmpty()) {
                    hashMap.remove(str);
                }
            }
            sparseArray.remove(sp3Var.getObserverTag());
        }
    }

    public final void w(int i) {
        tp3 o;
        boolean z;
        TL_account.saveAutoDownloadSettings saveautodownloadsettings = new TL_account.saveAutoDownloadSettings();
        if (i == 0) {
            o = n();
            z = this.N.g;
        } else if (i == 1) {
            o = p();
            z = this.O.g;
        } else {
            o = o();
            z = this.P.g;
        }
        TLRPC.TL_autoDownloadSettings tL_autoDownloadSettings = new TLRPC.TL_autoDownloadSettings();
        saveautodownloadsettings.settings = tL_autoDownloadSettings;
        boolean z2 = o.d;
        long[] jArr = o.b;
        tL_autoDownloadSettings.audio_preload_next = z2;
        tL_autoDownloadSettings.video_preload_large = o.c;
        tL_autoDownloadSettings.phonecalls_less_data = o.f;
        tL_autoDownloadSettings.video_upload_maxbitrate = o.h;
        tL_autoDownloadSettings.disabled = !z;
        byte b = 0;
        int i2 = 0;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        while (true) {
            int[] iArr = o.a;
            if (i2 >= iArr.length) {
                break;
            }
            int i3 = iArr[i2];
            if ((i3 & 1) != 0) {
                z3 = true;
            }
            if ((i3 & 4) != 0) {
                z4 = true;
            }
            if ((i3 & 8) != 0) {
                z5 = true;
            }
            if (z3 && z4 && z5) {
                break;
            } else {
                i2++;
            }
        }
        TLRPC.TL_autoDownloadSettings tL_autoDownloadSettings2 = saveautodownloadsettings.settings;
        tL_autoDownloadSettings2.photo_size_max = z3 ? (int) jArr[0] : 0;
        tL_autoDownloadSettings2.video_size_max = z4 ? jArr[1] : 0L;
        tL_autoDownloadSettings2.file_size_max = z5 ? jArr[2] : 0L;
        getConnectionsManager().sendRequest(saveautodownloadsettings, new ce2(b));
    }

    public final void y() {
        ArrayList arrayList = this.H;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (getFileLoader().S(((k27) arrayList.get(size)).S0())) {
                getFileLoader().X(((k27) arrayList.get(size)).F0(), arrayList.get(size), 2, 0);
            }
        }
    }
}
