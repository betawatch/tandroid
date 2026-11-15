package tg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.os.Build;
import android.os.IInterface;
import android.os.Parcel;
import android.os.WorkSource;
import android.util.Log;
import c8.yb;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.messenger.ff;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.vg;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class x implements ii, com.google.android.gms.common.api.internal.q {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ x(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static x a(Context context) {
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
            try {
                return new x(5, fileChannel, fileLock);
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
        } catch (IOException | Error | OverlappingFileLockException e14) {
            e = e14;
            fileChannel = null;
            fileLock = null;
        }
    }

    @Override // org.telegram.ui.Components.ii
    public boolean V1() {
        System.currentTimeMillis();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0084 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d5 A[Catch: all -> 0x0097, TryCatch #0 {all -> 0x0097, blocks: (B:15:0x0084, B:19:0x0091, B:20:0x00a5, B:22:0x00d5, B:25:0x00de, B:28:0x0115, B:54:0x009b), top: B:14:0x0084 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0115 A[Catch: all -> 0x0097, TRY_LEAVE, TryCatch #0 {all -> 0x0097, blocks: (B:15:0x0084, B:19:0x0091, B:20:0x00a5, B:22:0x00d5, B:25:0x00de, B:28:0x0115, B:54:0x009b), top: B:14:0x0084 }] */
    /* JADX WARN: Type inference failed for: r12v0, types: [int] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    @Override // com.google.android.gms.common.api.internal.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void accept(Object obj, Object obj2) {
        ?? length;
        n6.c cVar;
        boolean z10;
        ?? r12;
        a0.l lVar;
        u7.j jVar;
        a0.l lVar2;
        switch (this.a) {
            case 1:
                androidx.activity.n nVar = (androidx.activity.n) this.b;
                LocationRequest locationRequest = (LocationRequest) this.c;
                u7.l lVar3 = (u7.l) obj;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                lVar3.getClass();
                com.google.android.gms.common.api.internal.o i7 = nVar.i();
                com.google.android.gms.common.api.internal.m mVar = i7.b;
                mVar.getClass();
                q6.h0 h0Var = lVar3.B;
                n6.c[] cVarArr = h0Var == null ? null : h0Var.b;
                if (cVarArr != null) {
                    length = cVarArr.length;
                    int i10 = 0;
                    while (true) {
                        if (i10 < length) {
                            cVar = cVarArr[i10];
                            if (!"location_updates_with_callback".equals(cVar.a)) {
                                i10++;
                            }
                        } else {
                            cVar = null;
                        }
                    }
                    if (cVar != null) {
                        length = 1;
                        r12 = 1;
                        if (cVar.b() >= 1) {
                            z10 = true;
                            lVar = lVar3.G;
                            synchronized (lVar) {
                                try {
                                    try {
                                        u7.j jVar2 = (u7.j) lVar3.G.get(mVar);
                                        if (jVar2 != null && !z10) {
                                            jVar2.n1(i7);
                                            jVar = jVar2;
                                            jVar2 = null;
                                            int identityHashCode = System.identityHashCode(mVar.a);
                                            String str = mVar.b;
                                            StringBuilder sb2 = new StringBuilder(str.length() + 1 + String.valueOf(identityHashCode).length());
                                            sb2.append(str);
                                            sb2.append("@");
                                            sb2.append(identityHashCode);
                                            String sb3 = sb2.toString();
                                            if (z10) {
                                                u7.y yVar = (u7.y) lVar3.n();
                                                int i11 = locationRequest.a;
                                                lVar2 = lVar;
                                                long j3 = locationRequest.b;
                                                long j10 = locationRequest.c;
                                                long j11 = locationRequest.d;
                                                long j12 = locationRequest.e;
                                                int i12 = locationRequest.f;
                                                float f10 = locationRequest.h;
                                                boolean z11 = locationRequest.n;
                                                long j13 = locationRequest.r;
                                                int i13 = locationRequest.s;
                                                int i14 = locationRequest.w;
                                                String str2 = locationRequest.x;
                                                boolean z12 = locationRequest.y;
                                                WorkSource workSource = locationRequest.E;
                                                u7.k kVar = locationRequest.F;
                                                String str3 = Build.VERSION.SDK_INT < 30 ? null : str2;
                                                if (j10 == -1) {
                                                    j10 = j3;
                                                } else if (i11 != 105) {
                                                    j10 = Math.min(j10, j3);
                                                }
                                                u7.m mVar2 = new u7.m(new LocationRequest(i11, j3, j10, Math.max(j11, j3), Long.MAX_VALUE, j12, i12, f10, z11, j13 == -1 ? j3 : j13, i13, i14, str3, z12, new WorkSource(workSource), kVar), null, false, false, null, false, false, null, Long.MAX_VALUE);
                                                u7.h hVar = new u7.h(taskCompletionSource, jVar);
                                                int i15 = u7.j.c;
                                                IInterface queryLocalInterface = jVar.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
                                                IInterface iVar = queryLocalInterface instanceof j8.j ? (j8.j) queryLocalInterface : new j8.i(jVar, "com.google.android.gms.location.ILocationCallback", 10);
                                                IInterface queryLocalInterface2 = hVar.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
                                                IInterface vVar = queryLocalInterface2 instanceof u7.x ? (u7.x) queryLocalInterface2 : new u7.v(hVar, "com.google.android.gms.location.internal.IFusedLocationProviderCallback", 10);
                                                Parcel p12 = yVar.p1();
                                                int i16 = u7.d.a;
                                                p12.writeInt(1);
                                                int r10 = yb.r(p12, 20293);
                                                yb.q(p12, 1, 4);
                                                p12.writeInt(1);
                                                yb.k(p12, 2, mVar2, 0);
                                                yb.f(p12, 5, iVar.asBinder());
                                                yb.f(p12, 6, vVar.asBinder());
                                                yb.l(p12, 8, sb3);
                                                yb.s(p12, r10);
                                                yVar.t1(p12, 59);
                                            } else {
                                                u7.y yVar2 = (u7.y) lVar3.n();
                                                if (jVar2 == null) {
                                                    jVar2 = null;
                                                }
                                                u7.e eVar = new u7.e(null, taskCompletionSource);
                                                Parcel p13 = yVar2.p1();
                                                int i17 = u7.d.a;
                                                p13.writeInt(1);
                                                int r11 = yb.r(p13, 20293);
                                                yb.q(p13, 1, 4);
                                                p13.writeInt(2);
                                                yb.f(p13, 2, jVar2);
                                                yb.f(p13, 3, jVar);
                                                yb.l(p13, 6, sb3);
                                                yb.s(p13, r11);
                                                p13.writeInt(1);
                                                locationRequest.writeToParcel(p13, 0);
                                                u7.d.c(p13, eVar);
                                                yVar2.t1(p13, 88);
                                                lVar2 = lVar;
                                            }
                                            return;
                                        }
                                        jVar = new u7.j(nVar);
                                        lVar3.G.put(mVar, jVar);
                                        int identityHashCode2 = System.identityHashCode(mVar.a);
                                        String str4 = mVar.b;
                                        StringBuilder sb22 = new StringBuilder(str4.length() + 1 + String.valueOf(identityHashCode2).length());
                                        sb22.append(str4);
                                        sb22.append("@");
                                        sb22.append(identityHashCode2);
                                        String sb32 = sb22.toString();
                                        if (z10) {
                                        }
                                        return;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        r12 = lVar;
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                            }
                        }
                    }
                }
                z10 = false;
                r12 = length;
                lVar = lVar3.G;
                synchronized (lVar) {
                }
            default:
                v6.d dVar = new v6.d((v6.e) this.b, (TaskCompletionSource) obj2, 1);
                v6.c cVar2 = (v6.c) ((v6.f) obj).n();
                v6.a aVar = (v6.a) this.c;
                Parcel j14 = cVar2.j1();
                n7.a.c(j14, dVar);
                n7.a.b(j14, aVar);
                j14.writeStrongBinder(null);
                cVar2.k1(j14, 2);
                return;
        }
    }

    public void b(v4.e1 e1Var, e2.r0 r0Var) {
        a0.f fVar = (a0.f) this.b;
        v4.k1 k1Var = (v4.k1) fVar.get(e1Var);
        if (k1Var == null) {
            k1Var = v4.k1.a();
            fVar.put(e1Var, k1Var);
        }
        k1Var.c = r0Var;
        k1Var.a |= 8;
    }

    public File c() {
        if (((File) this.b) == null) {
            synchronized (this) {
                try {
                    if (((File) this.b) == null) {
                        String str = "PersistedInstallation." + ((o9.g) this.c).d() + ".json";
                        o9.g gVar = (o9.g) this.c;
                        gVar.a();
                        File file = new File(gVar.a.getNoBackupFilesDir(), str);
                        this.b = file;
                        if (file.exists()) {
                            return (File) this.b;
                        }
                        o9.g gVar2 = (o9.g) this.c;
                        gVar2.a();
                        File file2 = new File(gVar2.a.getFilesDir(), str);
                        if (file2.exists() && !file2.renameTo((File) this.b)) {
                            Log.e("PersistedInstallation", "Unable to move the file from back up to non back up directory", new IOException("Unable to move the file from back up to non back up directory"));
                            return file2;
                        }
                    }
                } finally {
                }
            }
        }
        return (File) this.b;
    }

    public void d(wa.b bVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", bVar.a);
            jSONObject.put("Status", p1.g.c(bVar.b));
            jSONObject.put("AuthToken", bVar.c);
            jSONObject.put("RefreshToken", bVar.d);
            jSONObject.put("TokenCreationEpochInSecs", bVar.f);
            jSONObject.put("ExpiresInSecs", bVar.e);
            jSONObject.put("FisError", bVar.g);
            o9.g gVar = (o9.g) this.c;
            gVar.a();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", gVar.a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (createTempFile.renameTo(c())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    @Override // org.telegram.ui.Components.ii
    public void d0(vg vgVar) {
        vgVar.run();
    }

    public e2.r0 e(v4.e1 e1Var, int i7) {
        v4.k1 k1Var;
        e2.r0 r0Var;
        a0.f fVar = (a0.f) this.b;
        int d = fVar.d(e1Var);
        if (d >= 0 && (k1Var = (v4.k1) fVar.i(d)) != null) {
            int i10 = k1Var.a;
            if ((i10 & i7) != 0) {
                int i11 = i10 & (~i7);
                k1Var.a = i11;
                if (i7 == 4) {
                    r0Var = k1Var.b;
                } else {
                    if (i7 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    r0Var = k1Var.c;
                }
                if ((i11 & 12) == 0) {
                    fVar.g(d);
                    k1Var.a = 0;
                    k1Var.b = null;
                    k1Var.c = null;
                    v4.k1.d.u(k1Var);
                }
                return r0Var;
            }
        }
        return null;
    }

    public wa.b f() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[TLObject.FLAG_14];
        try {
            FileInputStream fileInputStream = new FileInputStream(c());
            while (true) {
                try {
                    int read = fileInputStream.read(bArr, 0, TLObject.FLAG_14);
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
        int i7 = wa.b.h;
        byte b10 = (byte) (((byte) (0 | 2)) | 1);
        int i10 = p1.g.d(5)[optInt];
        if (i10 == 0) {
            throw new NullPointerException("Null registrationStatus");
        }
        byte b11 = (byte) (((byte) (b10 | 2)) | 1);
        if (b11 == 3 && i10 != 0) {
            return new wa.b(optString, i10, optString2, optString3, optLong2, optLong, optString4);
        }
        StringBuilder sb2 = new StringBuilder();
        if (i10 == 0) {
            sb2.append(" registrationStatus");
        }
        if ((b11 & 1) == 0) {
            sb2.append(" expiresInSecs");
        }
        if ((b11 & 2) == 0) {
            sb2.append(" tokenCreationEpochInSecs");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }

    public void g() {
        try {
            ((FileLock) this.c).release();
            ((FileChannel) this.b).close();
        } catch (IOException e10) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e10);
        }
    }

    @Override // org.telegram.ui.Components.ii
    public /* synthetic */ boolean g0() {
        return false;
    }

    public void h(v4.e1 e1Var) {
        v4.k1 k1Var = (v4.k1) ((a0.f) this.b).get(e1Var);
        if (k1Var == null) {
            return;
        }
        k1Var.a &= -2;
    }

    public void i(v4.e1 e1Var) {
        a0.f fVar = (a0.f) this.b;
        a0.h hVar = (a0.h) this.c;
        int m10 = hVar.m() - 1;
        while (true) {
            if (m10 < 0) {
                break;
            }
            if (e1Var == hVar.n(m10)) {
                Object[] objArr = hVar.c;
                Object obj = objArr[m10];
                Object obj2 = a0.i.a;
                if (obj != obj2) {
                    objArr[m10] = obj2;
                    hVar.a = true;
                }
            } else {
                m10--;
            }
        }
        v4.k1 k1Var = (v4.k1) fVar.get(e1Var);
        if (k1Var != null) {
            fVar.remove(e1Var);
            k1Var.a = 0;
            k1Var.b = null;
            k1Var.c = null;
            v4.k1.d.u(k1Var);
        }
    }

    @Override // org.telegram.ui.Components.ii
    public void y1(int i7, boolean z10, boolean z11, int i10, int i11, long j3, boolean z12, boolean z13, long j10) {
        ki kiVar = (ki) this.b;
        try {
            HashMap<Object, Object> selectedPhotos = kiVar.e2.getSelectedPhotos();
            if (selectedPhotos.isEmpty()) {
                return;
            }
            ff ffVar = (ff) selectedPhotos.values().iterator().next();
            String str = ffVar.h;
            if (str == null) {
                str = ffVar.I;
            }
            g0 g0Var = (g0) this.c;
            g0Var.d0(g0Var.f0(str, true));
            kiVar.dismiss();
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
    }

    public x(Context context) {
        this.a = 8;
        this.c = new AtomicLong(-1L);
        this.b = new s6.d(context, s6.d.m, new q6.q("mlkit:natural_language"), com.google.android.gms.common.api.i.c);
    }

    public x(int i7, byte b10) {
        this.a = i7;
        switch (i7) {
            case 9:
                break;
            default:
                this.b = new a0.f(0);
                this.c = new a0.h();
                break;
        }
    }

    public x(o9.g gVar) {
        this.a = 6;
        this.c = gVar;
    }

    public x(String str, String str2) {
        this.a = 2;
        this.b = str;
        this.c = str2;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("userId should not be empty");
        }
    }

    public x(int i7) {
        this.a = 7;
        Bitmap createBitmap = Bitmap.createBitmap(i7, i7, Bitmap.Config.ALPHA_8);
        this.b = createBitmap;
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        this.c = new BitmapShader(createBitmap, tileMode, tileMode);
    }

    public x(g0 g0Var, ki kiVar) {
        this.a = 0;
        this.c = g0Var;
        this.b = kiVar;
    }

    @Override // org.telegram.ui.Components.ii
    public /* synthetic */ void R0(Object obj) {
    }

    @Override // org.telegram.ui.Components.ii
    public /* synthetic */ void h1(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.ii
    public /* synthetic */ void K0() {
    }

    @Override // org.telegram.ui.Components.ii
    public /* synthetic */ void v0() {
    }

    @Override // org.telegram.ui.Components.ii
    public /* synthetic */ void b2(ArrayList arrayList, CharSequence charSequence, boolean z10, int i7, int i10, long j3, boolean z11, long j10) {
    }
}
