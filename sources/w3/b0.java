package w3;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.HandlerThread;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import d5.g0;
import e0.i0;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.InvocationTargetException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class b0 implements y, r4.g, y2.b, y3.j, ud.b {
    public final /* synthetic */ int a;
    public final Object b;
    public Object c;

    public /* synthetic */ b0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0042 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static b0 d(Context context) {
        FileChannel fileChannel;
        FileLock fileLock;
        try {
            fileChannel = new RandomAccessFile(new File(context.getFilesDir(), "generatefid.lock"), "rw").getChannel();
            try {
                fileLock = fileChannel.lock();
            } catch (IOException | Error | OverlappingFileLockException e9) {
                e = e9;
                fileLock = null;
            }
        } catch (IOException | Error | OverlappingFileLockException e10) {
            e = e10;
            fileChannel = null;
            fileLock = null;
        }
        try {
            return new b0(14, fileChannel, fileLock);
        } catch (IOException e11) {
            e = e11;
            Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
            if (fileLock != null) {
                try {
                    fileLock.release();
                } catch (IOException unused) {
                }
            }
            if (fileChannel != null) {
                try {
                    fileChannel.close();
                } catch (IOException unused2) {
                }
            }
            return null;
        } catch (Error e12) {
            e = e12;
            Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
            if (fileLock != null) {
            }
            if (fileChannel != null) {
            }
            return null;
        } catch (OverlappingFileLockException e13) {
            e = e13;
            Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
            if (fileLock != null) {
            }
            if (fileChannel != null) {
            }
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    @Override // ud.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void A(float f10, int i10) {
        boolean z10;
        yg.i iVar = (yg.i) this.c;
        boolean z11 = true;
        if ((iVar.b() == 0.0f && iVar.s == 2) || iVar.s == 3) {
            iVar.s = 1;
            z10 = true;
        } else {
            z10 = false;
        }
        if (f10 == 1.0f) {
            int i11 = iVar.w;
            int i12 = iVar.v;
            if (i11 != i12) {
                iVar.w = i12;
                if (z11) {
                    ((Runnable) this.b).run();
                }
                iVar.a();
            }
        }
        z11 = z10;
        if (z11) {
        }
        iVar.a();
    }

    @Override // w3.y
    public void b(d5.z zVar) {
        c0 c0Var = (c0) this.c;
        SparseArray sparseArray = c0Var.f;
        d5.y yVar = (d5.y) this.b;
        if (zVar.r() == 0 && (zVar.r() & 128) != 0) {
            zVar.D(6);
            int a2 = zVar.a() / 4;
            for (int i10 = 0; i10 < a2; i10++) {
                zVar.c(0, 4, yVar.b);
                yVar.p(0);
                int i11 = yVar.i(16);
                yVar.s(3);
                if (i11 == 0) {
                    yVar.s(13);
                } else {
                    int i12 = yVar.i(13);
                    if (sparseArray.get(i12) == null) {
                        sparseArray.put(i12, new z(new i0(c0Var, i12)));
                        c0Var.l++;
                    }
                }
            }
            if (c0Var.a != 2) {
                sparseArray.remove(0);
            }
        }
    }

    @Override // r4.g
    public int c(long j10) {
        int i10;
        switch (this.a) {
            case 1:
                ArrayList arrayList = (ArrayList) this.c;
                Long valueOf = Long.valueOf(j10);
                int i11 = g0.a;
                int binarySearch = Collections.binarySearch(arrayList, valueOf);
                if (binarySearch < 0) {
                    i10 = ~binarySearch;
                } else {
                    int size = arrayList.size();
                    do {
                        binarySearch++;
                        if (binarySearch < size) {
                        }
                        i10 = binarySearch;
                    } while (((Comparable) arrayList.get(binarySearch)).compareTo(valueOf) == 0);
                    i10 = binarySearch;
                }
                if (i10 < arrayList.size()) {
                    return i10;
                }
                return -1;
            default:
                long[] jArr = (long[]) this.c;
                int b10 = g0.b(jArr, j10, false);
                if (b10 < jArr.length) {
                    return b10;
                }
                return -1;
        }
    }

    public void e(Object obj, String str) {
        ((ArrayList) this.b).add(a9.p.w(str, "=", String.valueOf(obj)));
    }

    @Override // r4.g
    public long f(int i10) {
        switch (this.a) {
            case 1:
                ArrayList arrayList = (ArrayList) this.c;
                d5.a.f(i10 >= 0);
                d5.a.f(i10 < arrayList.size());
                return ((Long) arrayList.get(i10)).longValue();
            default:
                long[] jArr = (long[]) this.c;
                d5.a.f(i10 >= 0);
                d5.a.f(i10 < jArr.length);
                return jArr[i10];
        }
    }

    @Override // y3.j
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public y3.c t1(y3.i iVar) {
        MediaCodec mediaCodec;
        String str = iVar.a.a;
        y3.c cVar = null;
        try {
            d5.a.c("createCodec:" + str);
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
                y3.c cVar2 = new y3.c(mediaCodec, (HandlerThread) ((y3.b) this.b).get(), (HandlerThread) ((y3.b) this.c).get());
                try {
                    d5.a.q();
                    y3.c.i(cVar2, iVar.b, iVar.d, iVar.e);
                    return cVar2;
                } catch (Exception e9) {
                    e = e9;
                    cVar = cVar2;
                    if (cVar != null) {
                        cVar.release();
                    } else if (mediaCodec != null) {
                        mediaCodec.release();
                    }
                    throw e;
                }
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Exception e11) {
            e = e11;
            mediaCodec = null;
        }
    }

    @Override // oc.a
    public Object get() {
        return new x2.d((Context) ((e.a) this.b).a, (u2.b) ((n1.d) this.c).get());
    }

    @Override // r4.g
    public List h(long j10) {
        r4.c cVar;
        switch (this.a) {
            case 1:
                int c10 = g0.c((ArrayList) this.c, Long.valueOf(j10), false);
                return c10 == -1 ? Collections.EMPTY_LIST : (List) ((ArrayList) this.b).get(c10);
            default:
                int e9 = g0.e((long[]) this.c, j10, false);
                return (e9 == -1 || (cVar = ((r4.c[]) this.b)[e9]) == r4.c.D) ? Collections.EMPTY_LIST : Collections.singletonList(cVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.List] */
    public ArrayList i() {
        ?? arrayList;
        ArrayList arrayList2 = new ArrayList();
        m5.o oVar = (m5.o) this.c;
        Context context = (Context) this.b;
        Class cls = (Class) oVar.b;
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) cls), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", cls + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new z8.c((String) it.next(), 0));
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CctBackendFactory j(String str) {
        Bundle bundle;
        Map map;
        PackageManager packageManager;
        if (((Map) this.c) == null) {
            Context context = (Context) this.b;
            try {
                packageManager = context.getPackageManager();
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
            }
            if (packageManager == null) {
                Log.w("BackendRegistry", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                if (serviceInfo == null) {
                    Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                    if (bundle != null) {
                        Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                        map = Collections.EMPTY_MAP;
                    } else {
                        HashMap hashMap = new HashMap();
                        for (String str2 : bundle.keySet()) {
                            Object obj = bundle.get(str2);
                            if ((obj instanceof String) && str2.startsWith("backend:")) {
                                for (String str3 : ((String) obj).split(",", -1)) {
                                    String trim = str3.trim();
                                    if (!trim.isEmpty()) {
                                        hashMap.put(trim, str2.substring(8));
                                    }
                                }
                            }
                        }
                        map = hashMap;
                    }
                    this.c = map;
                }
            }
            bundle = null;
            if (bundle != null) {
            }
            this.c = map;
        }
        String str4 = (String) ((Map) this.c).get(str);
        if (str4 == null) {
            return null;
        }
        try {
            return (CctBackendFactory) Class.forName(str4).asSubclass(CctBackendFactory.class).getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e9) {
            Log.w("BackendRegistry", "Class " + str4 + " is not found.", e9);
            return null;
        } catch (IllegalAccessException e10) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e10);
            return null;
        } catch (InstantiationException e11) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e11);
            return null;
        } catch (NoSuchMethodException e12) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e12);
            return null;
        } catch (InvocationTargetException e13) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e13);
            return null;
        }
    }

    public String k(String str) {
        String str2 = (String) this.c;
        Resources resources = (Resources) this.b;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public void l() {
        try {
            ((FileLock) this.c).release();
            ((FileChannel) this.b).close();
        } catch (IOException e9) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e9);
        }
    }

    public int m(Context context, com.google.android.gms.common.api.c cVar) {
        SparseIntArray sparseIntArray = (SparseIntArray) this.b;
        y5.l.h(context);
        y5.l.h(cVar);
        int i10 = 0;
        if (!cVar.j()) {
            return 0;
        }
        int k10 = cVar.k();
        int i11 = sparseIntArray.get(k10, -1);
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        while (true) {
            if (i12 >= sparseIntArray.size()) {
                i10 = -1;
                break;
            }
            int keyAt = sparseIntArray.keyAt(i12);
            if (keyAt > k10 && sparseIntArray.get(keyAt) == 0) {
                break;
            }
            i12++;
        }
        if (i10 == -1) {
            i10 = ((v5.e) this.c).d(context, k10);
        }
        sparseIntArray.put(k10, i10);
        return i10;
    }

    @Override // ud.b
    public void o(int i10, float f10, float f11, ud.c cVar) {
        yg.i iVar = (yg.i) this.c;
        iVar.c.a(f10);
        iVar.d.a(f10);
        iVar.b.a(f10);
        ((Runnable) this.b).run();
    }

    @Override // r4.g
    public int p() {
        switch (this.a) {
            case 1:
                return ((ArrayList) this.c).size();
            default:
                return ((long[]) this.c).length;
        }
    }

    public String toString() {
        switch (this.a) {
            case 6:
                StringBuilder sb2 = new StringBuilder(100);
                sb2.append(this.c.getClass().getSimpleName());
                sb2.append('{');
                ArrayList arrayList = (ArrayList) this.b;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    sb2.append((String) arrayList.get(i10));
                    if (i10 < size - 1) {
                        sb2.append(", ");
                    }
                }
                sb2.append('}');
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ b0(Object obj) {
        this.a = 6;
        this.c = obj;
        this.b = new ArrayList();
    }

    public b0(v5.e eVar) {
        this.a = 8;
        this.b = new SparseIntArray();
        y5.l.h(eVar);
        this.c = eVar;
    }

    public b0(yg.i iVar, Runnable runnable) {
        this.a = 12;
        this.c = iVar;
        this.b = runnable;
    }

    public b0(int i10) {
        this.a = 5;
        y3.b bVar = new y3.b(i10, 0);
        y3.b bVar2 = new y3.b(i10, 1);
        this.b = bVar;
        this.c = bVar2;
    }

    public b0(yf.g0 g0Var) {
        this.a = 10;
        this.b = g0Var;
    }

    public b0(Context context, int i10) {
        this.a = i10;
        switch (i10) {
            case 7:
                y5.l.h(context);
                Resources resources = context.getResources();
                this.b = resources;
                this.c = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
                break;
            default:
                this.c = null;
                this.b = context;
                break;
        }
    }

    public b0(c0 c0Var) {
        this.a = 0;
        this.c = c0Var;
        this.b = new d5.y(new byte[4], 4);
    }

    @Override // w3.y
    public void a(d5.f0 f0Var, m3.m mVar, e0 e0Var) {
    }
}
