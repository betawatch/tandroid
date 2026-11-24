// default package

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import j$.util.Map;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.messenger.voip.NativeInstance;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class wz0 {
    public final NativeInstance a;
    public volatile boolean f;
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final Set c = Collections.newSetFromMap(new ConcurrentHashMap());
    public volatile Set d = Collections.EMPTY_SET;
    public final CopyOnWriteArrayList e = new CopyOnWriteArrayList();
    public final HashMap g = new HashMap();
    public final HashMap h = new HashMap();
    public final HashMap i = new HashMap();
    public final HashSet j = new HashSet();

    public wz0(NativeInstance nativeInstance) {
        this.a = nativeInstance;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x005e, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String c(String str) {
        boolean z;
        for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(0).getCodecInfos()) {
            if (!mediaCodecInfo.isEncoder()) {
                String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                int length = supportedTypes.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    if (supportedTypes[i].equalsIgnoreCase(str)) {
                        if (Build.VERSION.SDK_INT >= 29) {
                            z = mediaCodecInfo.isHardwareAccelerated();
                        } else {
                            String lowerCase = mediaCodecInfo.getName().toLowerCase();
                            z = (lowerCase.startsWith("omx.google.") || lowerCase.startsWith("c2.android.") || lowerCase.contains(".sw.")) ? false : true;
                        }
                        if (z) {
                            return mediaCodecInfo.getName();
                        }
                    } else {
                        i++;
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        if (r11 < r0.longValue()) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004a, code lost:
    
        if (r11 <= r2.longValue()) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(long j, oz0 oz0Var) {
        if (!this.f) {
            String str = oz0Var.a;
            if (this.d.contains(str) && !this.c.contains(str)) {
                Long l = (Long) this.i.get(str);
                if (l != null) {
                }
                pc0 a = pc0.a(oz0Var.e, oz0Var.d);
                if (a == null || a.c <= 0) {
                    Map.-EL.merge(this.g, oz0Var.a, Long.valueOf(j), new qz0((byte) 0));
                    return false;
                }
                Map.-EL.merge(this.h, oz0Var.a, Long.valueOf(j), new qz0((byte) 0));
                vz0 vz0Var = (vz0) this.b.get(oz0Var.a);
                if (vz0Var == null) {
                    vz0Var = new vz0(this, oz0Var.a);
                    this.b.put(oz0Var.a, vz0Var);
                }
                vz0 vz0Var2 = vz0Var;
                byte[] bArr = oz0Var.d;
                int i = a.b;
                vz0Var2.c.post(new o57((Object) vz0Var2, j, (Object) Arrays.copyOfRange(bArr, i, a.c + i), a.a, (byte) 3));
                return true;
            }
            Long l2 = (Long) this.h.get(str);
            if (this.j.contains(str)) {
                if (this.b.containsKey(str)) {
                    if (l2 != null) {
                    }
                }
            }
        }
        Map.-EL.merge(this.g, oz0Var.a, Long.valueOf(j), new qz0((byte) 0));
        return false;
    }

    public final void b(String str, Throwable th) {
        if (w01.a) {
            fa4.e("[BroadcastHwVideo] " + str + " falls back to software", th);
        }
        this.c.add(str);
        HashSet hashSet = new HashSet(this.d);
        hashSet.remove(str);
        this.d = hashSet;
        e(str);
    }

    public final void d(long j, int i, long j2) {
        long[] jArr = {j, j2, i};
        CopyOnWriteArrayList copyOnWriteArrayList = this.e;
        copyOnWriteArrayList.add(jArr);
        long nanoTime = System.nanoTime() / 1000000;
        while (copyOnWriteArrayList.size() > 2 && ((long[]) copyOnWriteArrayList.get(1))[1] <= nanoTime) {
            copyOnWriteArrayList.remove(0);
        }
        Iterator it = copyOnWriteArrayList.iterator();
        long[] jArr2 = null;
        while (it.hasNext()) {
            long[] jArr3 = (long[]) it.next();
            if (jArr3[1] > nanoTime) {
                break;
            } else {
                jArr2 = jArr3;
            }
        }
        if (jArr2 != null) {
            HashSet hashSet = this.j;
            ArrayList arrayList = new ArrayList(hashSet);
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                String str = (String) obj;
                HashMap hashMap = this.h;
                Long l = (Long) hashMap.get(str);
                if (l == null || jArr2[0] > l.longValue()) {
                    hashSet.remove(str);
                    hashMap.remove(str);
                    this.i.remove(str);
                    e(str);
                }
            }
        }
    }

    public final void e(String str) {
        vz0 vz0Var = (vz0) this.b.remove(str);
        if (vz0Var != null) {
            vz0Var.c.post(new tz0(vz0Var, (byte) 0));
        }
    }
}
