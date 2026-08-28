package w4;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.HandlerThread;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import d5.f0;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
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
import n5.e0;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.beta.R;
import r4.f;
import s8.h;
import x5.l;
import xf.g0;
import xg.i;
import y3.j;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class e implements f, y2.b, td.b, j {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ e(int i9, Object obj, Object obj2) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0042 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static e a(Context context) {
        FileChannel fileChannel;
        FileLock fileLock;
        try {
            fileChannel = new RandomAccessFile(new File(context.getFilesDir(), "generatefid.lock"), "rw").getChannel();
            try {
                fileLock = fileChannel.lock();
            } catch (IOException | Error | OverlappingFileLockException e10) {
                e = e10;
                fileLock = null;
            }
        } catch (IOException | Error | OverlappingFileLockException e11) {
            e = e11;
            fileChannel = null;
            fileLock = null;
        }
        try {
            return new e(13, fileChannel, fileLock);
        } catch (IOException e12) {
            e = e12;
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
        } catch (Error e13) {
            e = e13;
            Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
            if (fileLock != null) {
            }
            if (fileChannel != null) {
            }
            return null;
        } catch (OverlappingFileLockException e14) {
            e = e14;
            Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
            if (fileLock != null) {
            }
            if (fileChannel != null) {
            }
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    @Override // td.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void B(float f10, int i9) {
        boolean z10;
        i iVar = (i) this.c;
        boolean z11 = true;
        if ((iVar.b() == 0.0f && iVar.s == 2) || iVar.s == 3) {
            iVar.s = 1;
            z10 = true;
        } else {
            z10 = false;
        }
        if (f10 == 1.0f) {
            int i10 = iVar.w;
            int i11 = iVar.v;
            if (i10 != i11) {
                iVar.w = i11;
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

    @Override // td.b
    public void J0(int i9, float f10, float f11, td.c cVar) {
        i iVar = (i) this.c;
        iVar.c.a(f10);
        iVar.d.a(f10);
        iVar.b.a(f10);
        ((Runnable) this.b).run();
    }

    @Override // r4.f
    public int b(long j10) {
        int i9;
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.c;
                Long valueOf = Long.valueOf(j10);
                int i10 = f0.a;
                int binarySearch = Collections.binarySearch(arrayList, valueOf);
                if (binarySearch < 0) {
                    i9 = ~binarySearch;
                } else {
                    int size = arrayList.size();
                    do {
                        binarySearch++;
                        if (binarySearch < size) {
                        }
                        i9 = binarySearch;
                    } while (((Comparable) arrayList.get(binarySearch)).compareTo(valueOf) == 0);
                    i9 = binarySearch;
                }
                if (i9 < arrayList.size()) {
                    return i9;
                }
                return -1;
            default:
                long[] jArr = (long[]) this.c;
                int b10 = f0.b(jArr, j10, false);
                if (b10 < jArr.length) {
                    return b10;
                }
                return -1;
        }
    }

    public void c(Object obj, String str) {
        ((ArrayList) this.b).add(aa.d.z(str, "=", String.valueOf(obj)));
    }

    @Override // y3.j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public y3.c G(y3.i iVar) {
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
                } catch (Exception e10) {
                    e = e10;
                    cVar = cVar2;
                    if (cVar != null) {
                        cVar.release();
                    } else if (mediaCodec != null) {
                        mediaCodec.release();
                    }
                    throw e;
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Exception e12) {
            e = e12;
            mediaCodec = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.List] */
    public ArrayList e() {
        ?? arrayList;
        ArrayList arrayList2 = new ArrayList();
        na.e eVar = (na.e) this.c;
        Context context = (Context) this.b;
        Class cls = eVar.a;
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
            arrayList2.add(new y8.c((String) it.next(), 0));
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CctBackendFactory f(String str) {
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
        } catch (ClassNotFoundException e10) {
            Log.w("BackendRegistry", "Class " + str4 + " is not found.", e10);
            return null;
        } catch (IllegalAccessException e11) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e11);
            return null;
        } catch (InstantiationException e12) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e12);
            return null;
        } catch (NoSuchMethodException e13) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e13);
            return null;
        } catch (InvocationTargetException e14) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e14);
            return null;
        }
    }

    public File g() {
        if (((File) this.b) == null) {
            synchronized (this) {
                try {
                    if (((File) this.b) == null) {
                        h hVar = (h) this.c;
                        hVar.a();
                        this.b = new File(hVar.a.getFilesDir(), "PersistedInstallation." + ((h) this.c).d() + ".json");
                    }
                } finally {
                }
            }
        }
        return (File) this.b;
    }

    @Override // nc.a
    public Object get() {
        return new x2.d((Context) ((e0) this.b).b, (t5.c) ((e0) this.c).get());
    }

    @Override // r4.f
    public long h(int i9) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.c;
                d5.a.f(i9 >= 0);
                d5.a.f(i9 < arrayList.size());
                return ((Long) arrayList.get(i9)).longValue();
            default:
                long[] jArr = (long[]) this.c;
                d5.a.f(i9 >= 0);
                d5.a.f(i9 < jArr.length);
                return jArr[i9];
        }
    }

    public String i(String str) {
        String str2 = (String) this.c;
        Resources resources = (Resources) this.b;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public void j(z9.a aVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", aVar.a);
            jSONObject.put("Status", m1.j.b(aVar.b));
            jSONObject.put("AuthToken", aVar.c);
            jSONObject.put("RefreshToken", aVar.d);
            jSONObject.put("TokenCreationEpochInSecs", aVar.f);
            jSONObject.put("ExpiresInSecs", aVar.e);
            jSONObject.put("FisError", aVar.g);
            h hVar = (h) this.c;
            hVar.a();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", hVar.a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (createTempFile.renameTo(g())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public z9.a k() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(g());
            while (true) {
                try {
                    int read = fileInputStream.read(bArr, 0, 16384);
                    if (read < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } finally {
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String optString = jSONObject.optString("Fid", null);
        int optInt = jSONObject.optInt("Status", 0);
        String optString2 = jSONObject.optString("AuthToken", null);
        String optString3 = jSONObject.optString("RefreshToken", null);
        long optLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String optString4 = jSONObject.optString("FisError", null);
        int i9 = m1.j.c(5)[optInt];
        if (i9 == 0) {
            throw new NullPointerException("Null registrationStatus");
        }
        String str = i9 == 0 ? " registrationStatus" : "";
        if (str.isEmpty()) {
            return new z9.a(optString, i9, optString2, optString3, optLong2, optLong, optString4);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public void l() {
        try {
            ((FileLock) this.c).release();
            ((FileChannel) this.b).close();
        } catch (IOException e10) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e10);
        }
    }

    @Override // r4.f
    public List m(long j10) {
        r4.b bVar;
        switch (this.a) {
            case 0:
                int c10 = f0.c((ArrayList) this.c, Long.valueOf(j10), false);
                return c10 == -1 ? Collections.EMPTY_LIST : (List) ((ArrayList) this.b).get(c10);
            default:
                int e10 = f0.e((long[]) this.c, j10, false);
                return (e10 == -1 || (bVar = ((r4.b[]) this.b)[e10]) == r4.b.D) ? Collections.EMPTY_LIST : Collections.singletonList(bVar);
        }
    }

    public int n(Context context, com.google.android.gms.common.api.c cVar) {
        SparseIntArray sparseIntArray = (SparseIntArray) this.b;
        l.h(context);
        l.h(cVar);
        int i9 = 0;
        if (!cVar.k()) {
            return 0;
        }
        int l10 = cVar.l();
        int i10 = sparseIntArray.get(l10, -1);
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        while (true) {
            if (i11 >= sparseIntArray.size()) {
                i9 = -1;
                break;
            }
            int keyAt = sparseIntArray.keyAt(i11);
            if (keyAt > l10 && sparseIntArray.get(keyAt) == 0) {
                break;
            }
            i11++;
        }
        if (i9 == -1) {
            i9 = ((u5.e) this.c).d(context, l10);
        }
        sparseIntArray.put(l10, i9);
        return i9;
    }

    @Override // r4.f
    public int r() {
        switch (this.a) {
            case 0:
                return ((ArrayList) this.c).size();
            default:
                return ((long[]) this.c).length;
        }
    }

    public String toString() {
        switch (this.a) {
            case 4:
                StringBuilder sb2 = new StringBuilder(100);
                sb2.append(this.c.getClass().getSimpleName());
                sb2.append('{');
                ArrayList arrayList = (ArrayList) this.b;
                int size = arrayList.size();
                for (int i9 = 0; i9 < size; i9++) {
                    sb2.append((String) arrayList.get(i9));
                    if (i9 < size - 1) {
                        sb2.append(", ");
                    }
                }
                sb2.append('}');
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ e(Object obj) {
        this.a = 4;
        this.c = obj;
        this.b = new ArrayList();
    }

    public e(u5.e eVar) {
        this.a = 6;
        this.b = new SparseIntArray();
        l.h(eVar);
        this.c = eVar;
    }

    public e(i iVar, Runnable runnable) {
        this.a = 10;
        this.c = iVar;
        this.b = runnable;
    }

    public e(int i9) {
        this.a = 11;
        y3.b bVar = new y3.b(i9, 0);
        y3.b bVar2 = new y3.b(i9, 1);
        this.b = bVar;
        this.c = bVar2;
    }

    public e(g0 g0Var) {
        this.a = 8;
        this.b = g0Var;
    }

    public e(h hVar) {
        this.a = 14;
        this.c = hVar;
    }

    public e(Context context, int i9) {
        this.a = i9;
        switch (i9) {
            case 5:
                l.h(context);
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
}
