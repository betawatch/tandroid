package t1;

import a0.l;
import a8.p0;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.os.Build;
import android.os.IInterface;
import android.os.Parcel;
import android.os.WorkSource;
import android.util.Log;
import android.widget.EditText;
import androidx.activity.n;
import c8.cc;
import com.google.android.gms.common.api.internal.m;
import com.google.android.gms.common.api.internal.o;
import com.google.android.gms.common.api.internal.q;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.TaskCompletionSource;
import e2.r0;
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
import org.telegram.messenger.ef;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fh;
import org.telegram.ui.Components.ri;
import org.telegram.ui.Components.ti;
import q6.h0;
import tg.l0;
import u7.u;
import u7.w;
import u7.x;
import v4.f1;
import v4.l1;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class a implements ri, q {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ a(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static a a(Context context) {
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
                return new a(6, fileChannel, fileLock);
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

    @Override // org.telegram.ui.Components.ri
    public void S(fh fhVar) {
        fhVar.run();
    }

    @Override // org.telegram.ui.Components.ri
    public /* synthetic */ boolean T() {
        return false;
    }

    @Override // org.telegram.ui.Components.ri
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
        l lVar;
        u7.i iVar;
        l lVar2;
        switch (this.a) {
            case 2:
                n nVar = (n) this.b;
                LocationRequest locationRequest = (LocationRequest) this.c;
                u7.k kVar = (u7.k) obj;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                kVar.getClass();
                o i7 = nVar.i();
                m mVar = i7.b;
                mVar.getClass();
                h0 h0Var = kVar.B;
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
                            lVar = kVar.G;
                            synchronized (lVar) {
                                try {
                                    try {
                                        u7.i iVar2 = (u7.i) kVar.G.get(mVar);
                                        if (iVar2 != null && !z10) {
                                            iVar2.n1(i7);
                                            iVar = iVar2;
                                            iVar2 = null;
                                            int identityHashCode = System.identityHashCode(mVar.a);
                                            String str = mVar.b;
                                            StringBuilder sb2 = new StringBuilder(str.length() + 1 + String.valueOf(identityHashCode).length());
                                            sb2.append(str);
                                            sb2.append("@");
                                            sb2.append(identityHashCode);
                                            String sb3 = sb2.toString();
                                            if (z10) {
                                                x xVar = (x) kVar.n();
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
                                                u7.j jVar = locationRequest.F;
                                                String str3 = Build.VERSION.SDK_INT < 30 ? null : str2;
                                                if (j10 == -1) {
                                                    j10 = j3;
                                                } else if (i11 != 105) {
                                                    j10 = Math.min(j10, j3);
                                                }
                                                u7.l lVar3 = new u7.l(new LocationRequest(i11, j3, j10, Math.max(j11, j3), Long.MAX_VALUE, j12, i12, f10, z11, j13 == -1 ? j3 : j13, i13, i14, str3, z12, new WorkSource(workSource), jVar), null, false, false, null, false, false, null, Long.MAX_VALUE);
                                                u7.h hVar = new u7.h(taskCompletionSource, iVar);
                                                int i15 = u7.i.c;
                                                IInterface queryLocalInterface = iVar.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
                                                IInterface iVar3 = queryLocalInterface instanceof j8.j ? (j8.j) queryLocalInterface : new j8.i(iVar, "com.google.android.gms.location.ILocationCallback", 10);
                                                IInterface queryLocalInterface2 = hVar.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
                                                IInterface uVar = queryLocalInterface2 instanceof w ? (w) queryLocalInterface2 : new u(hVar, "com.google.android.gms.location.internal.IFusedLocationProviderCallback", 10);
                                                Parcel p12 = xVar.p1();
                                                int i16 = u7.d.a;
                                                p12.writeInt(1);
                                                int r10 = cc.r(p12, 20293);
                                                cc.q(p12, 1, 4);
                                                p12.writeInt(1);
                                                cc.k(p12, 2, lVar3, 0);
                                                cc.f(p12, 5, iVar3.asBinder());
                                                cc.f(p12, 6, uVar.asBinder());
                                                cc.l(p12, 8, sb3);
                                                cc.s(p12, r10);
                                                xVar.t1(p12, 59);
                                            } else {
                                                x xVar2 = (x) kVar.n();
                                                if (iVar2 == null) {
                                                    iVar2 = null;
                                                }
                                                u7.e eVar = new u7.e(null, taskCompletionSource);
                                                Parcel p13 = xVar2.p1();
                                                int i17 = u7.d.a;
                                                p13.writeInt(1);
                                                int r11 = cc.r(p13, 20293);
                                                cc.q(p13, 1, 4);
                                                p13.writeInt(2);
                                                cc.f(p13, 2, iVar2);
                                                cc.f(p13, 3, iVar);
                                                cc.l(p13, 6, sb3);
                                                cc.s(p13, r11);
                                                p13.writeInt(1);
                                                locationRequest.writeToParcel(p13, 0);
                                                u7.d.c(p13, eVar);
                                                xVar2.t1(p13, 88);
                                                lVar2 = lVar;
                                            }
                                            return;
                                        }
                                        iVar = new u7.i(nVar);
                                        kVar.G.put(mVar, iVar);
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
                lVar = kVar.G;
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

    public void b(f1 f1Var, r0 r0Var) {
        a0.f fVar = (a0.f) this.b;
        l1 l1Var = (l1) fVar.get(f1Var);
        if (l1Var == null) {
            l1Var = l1.a();
            fVar.put(f1Var, l1Var);
        }
        l1Var.c = r0Var;
        l1Var.a |= 8;
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

    public r0 e(f1 f1Var, int i7) {
        l1 l1Var;
        r0 r0Var;
        a0.f fVar = (a0.f) this.b;
        int d = fVar.d(f1Var);
        if (d >= 0 && (l1Var = (l1) fVar.i(d)) != null) {
            int i10 = l1Var.a;
            if ((i10 & i7) != 0) {
                int i11 = i10 & (~i7);
                l1Var.a = i11;
                if (i7 == 4) {
                    r0Var = l1Var.b;
                } else {
                    if (i7 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    r0Var = l1Var.c;
                }
                if ((i11 & 12) == 0) {
                    fVar.g(d);
                    l1Var.a = 0;
                    l1Var.b = null;
                    l1Var.c = null;
                    l1.d.t(l1Var);
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
        throw new IllegalStateException(p0.q("Missing required properties:", sb2));
    }

    public void g() {
        try {
            ((FileLock) this.c).release();
            ((FileChannel) this.b).close();
        } catch (IOException e10) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e10);
        }
    }

    public void h(f1 f1Var) {
        l1 l1Var = (l1) ((a0.f) this.b).get(f1Var);
        if (l1Var == null) {
            return;
        }
        l1Var.a &= -2;
    }

    public void i(f1 f1Var) {
        a0.f fVar = (a0.f) this.b;
        a0.h hVar = (a0.h) this.c;
        int m10 = hVar.m() - 1;
        while (true) {
            if (m10 < 0) {
                break;
            }
            if (f1Var == hVar.n(m10)) {
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
        l1 l1Var = (l1) fVar.get(f1Var);
        if (l1Var != null) {
            fVar.remove(f1Var);
            l1Var.a = 0;
            l1Var.b = null;
            l1Var.c = null;
            l1.d.t(l1Var);
        }
    }

    @Override // org.telegram.ui.Components.ri
    public void y1(int i7, boolean z10, boolean z11, int i10, int i11, long j3, boolean z12, boolean z13, long j10) {
        ti tiVar = (ti) this.b;
        try {
            HashMap<Object, Object> selectedPhotos = tiVar.e2.getSelectedPhotos();
            if (selectedPhotos.isEmpty()) {
                return;
            }
            ef efVar = (ef) selectedPhotos.values().iterator().next();
            String str = efVar.h;
            if (str == null) {
                str = efVar.I;
            }
            l0 l0Var = (l0) this.c;
            l0Var.e0(l0Var.h0(str, true));
            tiVar.dismiss();
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
    }

    public a(Context context) {
        this.a = 9;
        this.c = new AtomicLong(-1L);
        this.b = new s6.d(context, s6.d.m, new q6.q("mlkit:natural_language"), com.google.android.gms.common.api.i.c);
    }

    public a(int i7, byte b10) {
        this.a = i7;
        switch (i7) {
            case 10:
                break;
            default:
                this.b = new a0.f(0);
                this.c = new a0.h();
                break;
        }
    }

    public a(o9.g gVar) {
        this.a = 7;
        this.c = gVar;
    }

    public a(String str, String str2) {
        this.a = 3;
        this.b = str;
        this.c = str2;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("userId should not be empty");
        }
    }

    public a(int i7) {
        this.a = 8;
        Bitmap createBitmap = Bitmap.createBitmap(i7, i7, Bitmap.Config.ALPHA_8);
        this.b = createBitmap;
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        this.c = new BitmapShader(createBitmap, tileMode, tileMode);
    }

    public a(EditText editText) {
        this.a = 0;
        this.b = editText;
        j jVar = new j(editText);
        this.c = jVar;
        editText.addTextChangedListener(jVar);
        if (b.b == null) {
            synchronized (b.a) {
                try {
                    if (b.b == null) {
                        b bVar = new b();
                        try {
                            b.c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, b.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        b.b = bVar;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(b.b);
    }

    @Override // org.telegram.ui.Components.ri
    public /* synthetic */ void B0() {
    }

    @Override // org.telegram.ui.Components.ri
    public /* synthetic */ void l0() {
    }

    @Override // org.telegram.ui.Components.ri
    public /* synthetic */ void O0(Object obj) {
    }

    @Override // org.telegram.ui.Components.ri
    public /* synthetic */ void h1(TLRPC.User user) {
    }

    public a(l0 l0Var, ti tiVar) {
        this.a = 1;
        this.c = l0Var;
        this.b = tiVar;
    }

    @Override // org.telegram.ui.Components.ri
    public /* synthetic */ void W1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i7, int i10, long j3, boolean z11, long j10) {
    }
}
