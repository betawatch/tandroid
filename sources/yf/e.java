package yf;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import b2.n1;
import bi.o6;
import j$.util.Comparator$-CC;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DispatchQueuePoolBackground;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.pf;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.q31;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class e {
    public static int A;
    public static a5.a B;
    public static boolean v;
    public static volatile boolean x;
    public static ThreadPoolExecutor z;
    public final BitmapDrawable a;
    public final int b;
    public final int c;
    public final AtomicInteger d = new AtomicInteger(0);
    public final ArrayList e;
    public final boolean f;
    public byte[] g;
    public final Object h;
    public int i;
    public boolean j;
    public volatile boolean k;
    public final int l;
    public final File m;
    public int n;
    public final AtomicBoolean o;
    public final rg.b0 p;
    public volatile boolean q;
    public volatile boolean r;
    public RandomAccessFile s;
    public BitmapFactory.Options t;
    public Bitmap u;
    public static final ConcurrentHashMap w = new ConcurrentHashMap();
    public static final int y = Utilities.clamp(Runtime.getRuntime().availableProcessors() - 2, 6, 1);

    /* JADX WARN: Multi-variable type inference failed */
    public e(File file, c cVar, n1 n1Var, int i10, int i11, boolean z10, int i12) {
        RandomAccessFile randomAccessFile;
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        this.h = new Object();
        this.o = new AtomicBoolean(false);
        this.p = new rg.b0(this, 9);
        this.a = (BitmapDrawable) cVar;
        this.b = i10;
        this.c = i11;
        this.l = n1Var.a;
        String name = file.getName();
        if (z == null) {
            int i13 = y;
            z = new ThreadPoolExecutor(i13, i13, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        }
        File file2 = new File(FileLoader.checkDirectory(4), "acache");
        if (!v) {
            file2.mkdir();
            v = true;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(name);
        sb2.append("_");
        sb2.append(i10);
        sb2.append("_");
        sb2.append(i11);
        sb2.append(z10 ? "_nolimit" : " ");
        File file3 = new File(file2, a4.a.s(sb2, i12 != 0 ? i2.g.i(i12, "_fitz") : "", ".pcache2"));
        this.m = file3;
        this.f = i10 < AndroidUtilities.dp(60.0f) && i11 < AndroidUtilities.dp(60.0f);
        if (SharedConfig.getDevicePerformanceClass() < 2) {
            this.k = false;
            this.q = false;
            return;
        }
        this.k = file3.exists();
        try {
            if (!this.k) {
                return;
            }
            try {
                randomAccessFile = new RandomAccessFile(file3, "r");
                try {
                    this.q = randomAccessFile.readBoolean();
                    if (this.q && arrayList.isEmpty()) {
                        randomAccessFile.seek(randomAccessFile.readInt());
                        int readInt = randomAccessFile.readInt();
                        d(randomAccessFile, readInt > 10000 ? 0 : readInt);
                        if (arrayList.size() == 0) {
                            this.q = false;
                            this.k = false;
                            file3.delete();
                        } else {
                            if (this.s != randomAccessFile) {
                                a();
                            }
                            this.s = randomAccessFile;
                        }
                    }
                    if (this.s != randomAccessFile) {
                        randomAccessFile.close();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        th.printStackTrace();
                        this.m.delete();
                        this.k = false;
                        if (this.s == randomAccessFile || randomAccessFile == null) {
                            return;
                        }
                        randomAccessFile.close();
                    } finally {
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                randomAccessFile = null;
            }
        } catch (IOException e7) {
            e7.printStackTrace();
        }
    }

    public static void c() {
        int i10 = A - 1;
        A = i10;
        if (i10 <= 0) {
            A = 0;
            xi0.T0.postRunnable(new q31(16));
        }
    }

    public final void a() {
        RandomAccessFile randomAccessFile = this.s;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (IOException e7) {
                e7.printStackTrace();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x0070, code lost:
    
        if (r16.s != r0) goto L110;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0185 A[Catch: all -> 0x0058, IOException -> 0x005b, FileNotFoundException -> 0x005e, TryCatch #12 {FileNotFoundException -> 0x005e, IOException -> 0x005b, blocks: (B:3:0x0002, B:95:0x004b, B:105:0x006e, B:114:0x007c, B:6:0x0083, B:8:0x0091, B:9:0x009b, B:10:0x00cb, B:77:0x00cf, B:12:0x00d7, B:14:0x00df, B:16:0x00e7, B:26:0x00f2, B:28:0x00f6, B:31:0x00fa, B:34:0x0102, B:36:0x00ff, B:40:0x0105, B:41:0x0127, B:43:0x012d, B:45:0x014a, B:18:0x0185, B:22:0x019f, B:51:0x01a6, B:53:0x01aa, B:54:0x01af, B:55:0x01b2, B:57:0x01b6, B:69:0x01ba, B:59:0x01c2, B:72:0x01bf, B:74:0x01cc, B:80:0x00d4), top: B:2:0x0002, outer: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01aa A[Catch: all -> 0x0058, IOException -> 0x005b, FileNotFoundException -> 0x005e, TryCatch #12 {FileNotFoundException -> 0x005e, IOException -> 0x005b, blocks: (B:3:0x0002, B:95:0x004b, B:105:0x006e, B:114:0x007c, B:6:0x0083, B:8:0x0091, B:9:0x009b, B:10:0x00cb, B:77:0x00cf, B:12:0x00d7, B:14:0x00df, B:16:0x00e7, B:26:0x00f2, B:28:0x00f6, B:31:0x00fa, B:34:0x0102, B:36:0x00ff, B:40:0x0105, B:41:0x0127, B:43:0x012d, B:45:0x014a, B:18:0x0185, B:22:0x019f, B:51:0x01a6, B:53:0x01aa, B:54:0x01af, B:55:0x01b2, B:57:0x01b6, B:69:0x01ba, B:59:0x01c2, B:72:0x01bf, B:74:0x01cc, B:80:0x00d4), top: B:2:0x0002, outer: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01b6 A[Catch: all -> 0x0058, IOException -> 0x005b, FileNotFoundException -> 0x005e, TRY_LEAVE, TryCatch #12 {FileNotFoundException -> 0x005e, IOException -> 0x005b, blocks: (B:3:0x0002, B:95:0x004b, B:105:0x006e, B:114:0x007c, B:6:0x0083, B:8:0x0091, B:9:0x009b, B:10:0x00cb, B:77:0x00cf, B:12:0x00d7, B:14:0x00df, B:16:0x00e7, B:26:0x00f2, B:28:0x00f6, B:31:0x00fa, B:34:0x0102, B:36:0x00ff, B:40:0x0105, B:41:0x0127, B:43:0x012d, B:45:0x014a, B:18:0x0185, B:22:0x019f, B:51:0x01a6, B:53:0x01aa, B:54:0x01af, B:55:0x01b2, B:57:0x01b6, B:69:0x01ba, B:59:0x01c2, B:72:0x01bf, B:74:0x01cc, B:80:0x00d4), top: B:2:0x0002, outer: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00cf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0091 A[Catch: all -> 0x0058, IOException -> 0x005b, FileNotFoundException -> 0x005e, TryCatch #12 {FileNotFoundException -> 0x005e, IOException -> 0x005b, blocks: (B:3:0x0002, B:95:0x004b, B:105:0x006e, B:114:0x007c, B:6:0x0083, B:8:0x0091, B:9:0x009b, B:10:0x00cb, B:77:0x00cf, B:12:0x00d7, B:14:0x00df, B:16:0x00e7, B:26:0x00f2, B:28:0x00f6, B:31:0x00fa, B:34:0x0102, B:36:0x00ff, B:40:0x0105, B:41:0x0127, B:43:0x012d, B:45:0x014a, B:18:0x0185, B:22:0x019f, B:51:0x01a6, B:53:0x01aa, B:54:0x01af, B:55:0x01b2, B:57:0x01b6, B:69:0x01ba, B:59:0x01c2, B:72:0x01bf, B:74:0x01cc, B:80:0x00d4), top: B:2:0x0002, outer: #9 }] */
    /* JADX WARN: Type inference failed for: r0v16, types: [android.graphics.drawable.BitmapDrawable, yf.c] */
    /* JADX WARN: Type inference failed for: r0v23, types: [android.graphics.drawable.BitmapDrawable, yf.c] */
    /* JADX WARN: Type inference failed for: r0v29, types: [android.graphics.drawable.BitmapDrawable, yf.c] */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.graphics.drawable.BitmapDrawable, yf.c] */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.graphics.drawable.BitmapDrawable, yf.c] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        int i10;
        RandomAccessFile randomAccessFile;
        Bitmap[] bitmapArr;
        CountDownLatch[] countDownLatchArr;
        int i11;
        int i12;
        CountDownLatch countDownLatch;
        try {
            try {
            } finally {
                this.a.c();
            }
        } catch (FileNotFoundException e7) {
            e7.printStackTrace();
        } catch (IOException e10) {
            e10.printStackTrace();
        }
        if (this.m.exists()) {
            try {
                randomAccessFile = new RandomAccessFile(this.m, "r");
            } catch (Throwable unused) {
                randomAccessFile = null;
            }
            try {
                this.q = randomAccessFile.readBoolean();
            } catch (Throwable unused2) {
                try {
                    this.m.delete();
                } catch (Throwable unused3) {
                }
                if (this.s != randomAccessFile && randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                    } catch (Throwable unused4) {
                    }
                }
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(this.m, "rw");
                if (B == null) {
                }
                B.a(this.c, this.b);
                a5.a aVar = B;
                bitmapArr = (Bitmap[]) aVar.d;
                a0[] a0VarArr = (a0[]) aVar.c;
                countDownLatchArr = new CountDownLatch[y];
                ArrayList arrayList = new ArrayList();
                randomAccessFile2.writeBoolean(false);
                randomAccessFile2.writeInt(0);
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                this.a.b();
                i11 = 0;
                i12 = 0;
                while (true) {
                    countDownLatch = countDownLatchArr[i11];
                    if (countDownLatch != null) {
                    }
                    if (!this.o.get()) {
                        break;
                    } else if (this.a.a(bitmapArr[i11]) == 1) {
                    }
                    this.d.set(i12);
                }
                if (BuildVars.DEBUG_VERSION) {
                }
                atomicBoolean.set(true);
                while (i10 < y) {
                }
                randomAccessFile2.close();
                this.a.c();
            }
            if (this.q) {
                this.e.clear();
                randomAccessFile.seek(randomAccessFile.readInt());
                int readInt = randomAccessFile.readInt();
                if (readInt > 10000) {
                    readInt = 0;
                }
                if (readInt > 0) {
                    d(randomAccessFile, readInt);
                    randomAccessFile.seek(0L);
                    if (this.s != randomAccessFile) {
                        a();
                    }
                    this.s = randomAccessFile;
                    this.k = true;
                    if (this.s != randomAccessFile) {
                        try {
                            randomAccessFile.close();
                        } catch (Throwable unused5) {
                        }
                    }
                }
                this.k = false;
                this.q = false;
            }
            if (!this.q) {
                this.m.delete();
            }
        }
        RandomAccessFile randomAccessFile22 = new RandomAccessFile(this.m, "rw");
        if (B == null) {
            B = new a5.a(25, (byte) 0);
        }
        B.a(this.c, this.b);
        a5.a aVar2 = B;
        bitmapArr = (Bitmap[]) aVar2.d;
        a0[] a0VarArr2 = (a0[]) aVar2.c;
        countDownLatchArr = new CountDownLatch[y];
        ArrayList arrayList2 = new ArrayList();
        randomAccessFile22.writeBoolean(false);
        randomAccessFile22.writeInt(0);
        AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
        this.a.b();
        i11 = 0;
        i12 = 0;
        while (true) {
            countDownLatch = countDownLatchArr[i11];
            if (countDownLatch != null) {
                try {
                    countDownLatch.await();
                } catch (InterruptedException e11) {
                    e11.printStackTrace();
                }
            }
            if (!this.o.get() || atomicBoolean2.get()) {
                break;
                break;
            }
            if (this.a.a(bitmapArr[i11]) == 1) {
                for (int i13 = 0; i13 < y; i13++) {
                    CountDownLatch countDownLatch2 = countDownLatchArr[i13];
                    if (countDownLatch2 != null) {
                        try {
                            countDownLatch2.await();
                        } catch (InterruptedException e12) {
                            e12.printStackTrace();
                        }
                    }
                }
                int length = (int) randomAccessFile22.length();
                Collections.sort(arrayList2, Comparator$-CC.comparingInt(new o6(13)));
                a0VarArr2[0].b();
                int size = arrayList2.size();
                a0VarArr2[0].c(size);
                for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                    a0VarArr2[0].c(((d) arrayList2.get(i14)).c);
                    a0VarArr2[0].c(((d) arrayList2.get(i14)).b);
                }
                randomAccessFile22.write(a0VarArr2[0].a, 0, (size * 8) + 4);
                a0VarArr2[0].b();
                randomAccessFile22.seek(0L);
                randomAccessFile22.writeBoolean(true);
                randomAccessFile22.writeInt(length);
                atomicBoolean2.set(true);
                randomAccessFile22.close();
                this.e.clear();
                this.e.addAll(arrayList2);
                a();
                this.s = new RandomAccessFile(this.m, "r");
                this.q = true;
                this.k = true;
            } else {
                countDownLatchArr[i11] = new CountDownLatch(1);
                z.execute(new pf(this, atomicBoolean2, bitmapArr, i11, a0VarArr2, i12, randomAccessFile22, arrayList2, countDownLatchArr));
                i11++;
                i12++;
                if (i11 >= y) {
                    i11 = 0;
                }
                this.d.set(i12);
            }
        }
        if (BuildVars.DEBUG_VERSION) {
            FileLog.d("cancelled cache generation");
        }
        atomicBoolean2.set(true);
        for (i10 = 0; i10 < y; i10++) {
            CountDownLatch countDownLatch3 = countDownLatchArr[i10];
            if (countDownLatch3 != null) {
                try {
                    countDownLatch3.await();
                } catch (InterruptedException e13) {
                    e13.printStackTrace();
                }
            }
            Bitmap bitmap = bitmapArr[i10];
            if (bitmap != null) {
                try {
                    bitmap.recycle();
                } catch (Exception unused6) {
                }
            }
        }
        randomAccessFile22.close();
        this.a.c();
    }

    public final void d(RandomAccessFile randomAccessFile, int i10) {
        if (i10 == 0) {
            return;
        }
        byte[] bArr = new byte[i10 * 8];
        randomAccessFile.read(bArr);
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        for (int i11 = 0; i11 < i10; i11++) {
            d dVar = new d(i11);
            dVar.c = wrap.getInt();
            dVar.b = wrap.getInt();
            this.e.add(dVar);
        }
    }

    public final byte[] e(d dVar) {
        boolean z10 = this.f && Thread.currentThread().getName().startsWith(DispatchQueuePoolBackground.THREAD_PREFIX);
        byte[] bArr = z10 ? (byte[]) w.get(Thread.currentThread()) : this.g;
        if (bArr != null && bArr.length >= dVar.b) {
            return bArr;
        }
        byte[] bArr2 = new byte[(int) (dVar.b * 1.3f)];
        if (!z10) {
            this.g = bArr2;
            return bArr2;
        }
        w.put(Thread.currentThread(), bArr2);
        if (!x) {
            x = true;
            AndroidUtilities.runOnUIThread(this.p, 5000L);
        }
        return bArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0123 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(Bitmap bitmap, int i10) {
        RandomAccessFile randomAccessFile;
        int i11;
        if (!this.j) {
            RandomAccessFile randomAccessFile2 = null;
            try {
                if (this.q || this.k) {
                    if (!this.q || (randomAccessFile = this.s) == null) {
                        randomAccessFile = new RandomAccessFile(this.m, "r");
                        try {
                            this.q = randomAccessFile.readBoolean();
                            if (this.q && this.e.isEmpty()) {
                                randomAccessFile.seek(randomAccessFile.readInt());
                                d(randomAccessFile, randomAccessFile.readInt());
                            }
                            if (this.e.size() == 0) {
                                this.q = false;
                            }
                            if (!this.q) {
                                randomAccessFile.close();
                                return -1;
                            }
                        } catch (FileNotFoundException unused) {
                            if (this.j && randomAccessFile != null) {
                                try {
                                    randomAccessFile.close();
                                } catch (IOException e7) {
                                    e7.printStackTrace();
                                }
                            }
                            return -1;
                        } catch (Throwable th2) {
                            th = th2;
                            FileLog.e(th, false);
                            i11 = this.n + 1;
                            this.n = i11;
                            if (i11 > 10) {
                                this.j = true;
                            }
                            if (this.j) {
                                randomAccessFile.close();
                            }
                            return -1;
                        }
                    }
                    try {
                        if (this.e.size() != 0) {
                            d dVar = (d) this.e.get(Utilities.clamp(i10, this.e.size() - 1, 0));
                            randomAccessFile.seek(dVar.c);
                            byte[] e10 = e(dVar);
                            randomAccessFile.readFully(e10, 0, dVar.b);
                            if (this.r) {
                                this.s = null;
                                randomAccessFile.close();
                            } else {
                                if (this.s != randomAccessFile) {
                                    a();
                                }
                                this.s = randomAccessFile;
                            }
                            if (this.t == null) {
                                this.t = new BitmapFactory.Options();
                            }
                            boolean z10 = bitmap.getConfig() == Bitmap.Config.ALPHA_8;
                            if (z10) {
                                Bitmap bitmap2 = this.u;
                                if (bitmap2 == null || bitmap2.getWidth() != bitmap.getWidth() || this.u.getHeight() != bitmap.getHeight()) {
                                    this.u = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                                }
                                this.t.inBitmap = this.u;
                            } else {
                                this.t.inBitmap = bitmap;
                            }
                            BitmapFactory.decodeByteArray(e10, 0, dVar.b, this.t);
                            if (z10) {
                                Utilities.extractAlpha(this.u, bitmap);
                            }
                            this.t.inBitmap = null;
                            return 0;
                        }
                    } catch (FileNotFoundException unused2) {
                        randomAccessFile2 = randomAccessFile;
                        randomAccessFile = randomAccessFile2;
                        if (this.j) {
                        }
                        return -1;
                    } catch (Throwable th3) {
                        th = th3;
                        randomAccessFile2 = randomAccessFile;
                        randomAccessFile = randomAccessFile2;
                        FileLog.e(th, false);
                        i11 = this.n + 1;
                        this.n = i11;
                        if (i11 > 10) {
                        }
                        if (this.j) {
                        }
                        return -1;
                    }
                }
            } catch (FileNotFoundException unused3) {
            } catch (Throwable th4) {
                th = th4;
            }
        }
        return -1;
    }

    public final boolean g() {
        return (this.q && this.k) ? false : true;
    }
}
