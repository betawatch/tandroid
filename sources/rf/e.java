package rf;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import b2.r1;
import bi.t6;
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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.b8;
import org.telegram.messenger.f8;
import org.telegram.messenger.i0;
import org.telegram.messenger.rr;
import org.telegram.messenger.tz;
import org.telegram.messenger.v2;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.ew;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
    public final ew p;
    public volatile boolean q;
    public volatile boolean r;
    public RandomAccessFile s;
    public BitmapFactory.Options t;
    public Bitmap u;
    public static final ConcurrentHashMap w = new ConcurrentHashMap();
    public static final int y = Utilities.j(Runtime.getRuntime().availableProcessors() - 2, 6, 1);

    /* JADX WARN: Multi-variable type inference failed */
    public e(File file, c cVar, r1 r1Var, int i10, int i11, boolean z10, int i12) {
        RandomAccessFile randomAccessFile;
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        this.h = new Object();
        this.o = new AtomicBoolean(false);
        this.p = new ew(this, 24);
        this.a = (BitmapDrawable) cVar;
        this.b = i10;
        this.c = i11;
        this.l = r1Var.a;
        String name = file.getName();
        if (z == null) {
            int i13 = y;
            z = new ThreadPoolExecutor(i13, i13, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        }
        File file2 = new File(b8.j(4), "acache");
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
        File file3 = new File(file2, a1.g.r(sb2, i12 != 0 ? i0.a.i(i12, "_fitz") : "", ".pcache2"));
        this.m = file3;
        this.f = i10 < i0.L(60.0f) && i11 < i0.L(60.0f);
        if (tz.o() < 2) {
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
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void c() {
        int i10 = A - 1;
        A = i10;
        if (i10 <= 0) {
            A = 0;
            bi0.T0.postRunnable(new r5.a(1));
        }
    }

    public final void a() {
        RandomAccessFile randomAccessFile = this.s;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x006f, code lost:
    
        if (r16.s != r0) goto L107;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ef A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01b8 A[Catch: all -> 0x0057, IOException -> 0x005a, FileNotFoundException -> 0x005d, TRY_LEAVE, TryCatch #12 {FileNotFoundException -> 0x005d, IOException -> 0x005a, blocks: (B:3:0x0002, B:97:0x004a, B:107:0x006d, B:116:0x007b, B:6:0x0082, B:8:0x008f, B:9:0x0098, B:10:0x00c8, B:79:0x00cc, B:12:0x00d4, B:14:0x00dc, B:16:0x00e4, B:52:0x00ef, B:28:0x00f6, B:30:0x00fa, B:33:0x00fe, B:36:0x0106, B:38:0x0103, B:42:0x0109, B:43:0x012b, B:45:0x0131, B:47:0x014e, B:20:0x0189, B:23:0x01a3, B:56:0x01aa, B:57:0x01b4, B:59:0x01b8, B:71:0x01bc, B:61:0x01c4, B:74:0x01c1, B:76:0x01ce, B:82:0x00d1), top: B:2:0x0002, outer: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x008f A[Catch: all -> 0x0057, IOException -> 0x005a, FileNotFoundException -> 0x005d, TryCatch #12 {FileNotFoundException -> 0x005d, IOException -> 0x005a, blocks: (B:3:0x0002, B:97:0x004a, B:107:0x006d, B:116:0x007b, B:6:0x0082, B:8:0x008f, B:9:0x0098, B:10:0x00c8, B:79:0x00cc, B:12:0x00d4, B:14:0x00dc, B:16:0x00e4, B:52:0x00ef, B:28:0x00f6, B:30:0x00fa, B:33:0x00fe, B:36:0x0106, B:38:0x0103, B:42:0x0109, B:43:0x012b, B:45:0x0131, B:47:0x014e, B:20:0x0189, B:23:0x01a3, B:56:0x01aa, B:57:0x01b4, B:59:0x01b8, B:71:0x01bc, B:61:0x01c4, B:74:0x01c1, B:76:0x01ce, B:82:0x00d1), top: B:2:0x0002, outer: #9 }] */
    /* JADX WARN: Type inference failed for: r0v16, types: [android.graphics.drawable.BitmapDrawable, rf.c] */
    /* JADX WARN: Type inference failed for: r0v24, types: [android.graphics.drawable.BitmapDrawable, rf.c] */
    /* JADX WARN: Type inference failed for: r0v29, types: [android.graphics.drawable.BitmapDrawable, rf.c] */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.graphics.drawable.BitmapDrawable, rf.c] */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.graphics.drawable.BitmapDrawable, rf.c] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        int i10;
        RandomAccessFile randomAccessFile;
        Bitmap[] bitmapArr;
        CountDownLatch[] countDownLatchArr;
        int i11;
        CountDownLatch countDownLatch;
        int a2;
        try {
            try {
            } finally {
                this.a.c();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e7) {
            e7.printStackTrace();
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
                x[] xVarArr = (x[]) aVar.c;
                countDownLatchArr = new CountDownLatch[y];
                ArrayList arrayList = new ArrayList();
                randomAccessFile2.writeBoolean(false);
                randomAccessFile2.writeInt(0);
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                this.a.b();
                i11 = 0;
                int i12 = 0;
                while (true) {
                    countDownLatch = countDownLatchArr[i11];
                    if (countDownLatch != null) {
                    }
                    if (!this.o.get()) {
                        break;
                    }
                    a2 = this.a.a(bitmapArr[i11]);
                    if (a2 != -1) {
                    }
                }
                boolean z10 = v2.a;
                f8.b("cancelled cache generation");
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
            B = new a5.a(19, (byte) 0);
        }
        B.a(this.c, this.b);
        a5.a aVar2 = B;
        bitmapArr = (Bitmap[]) aVar2.d;
        x[] xVarArr2 = (x[]) aVar2.c;
        countDownLatchArr = new CountDownLatch[y];
        ArrayList arrayList2 = new ArrayList();
        randomAccessFile22.writeBoolean(false);
        randomAccessFile22.writeInt(0);
        AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
        this.a.b();
        i11 = 0;
        int i122 = 0;
        while (true) {
            countDownLatch = countDownLatchArr[i11];
            if (countDownLatch != null) {
                try {
                    countDownLatch.await();
                } catch (InterruptedException e10) {
                    e10.printStackTrace();
                }
            }
            if (!this.o.get() || atomicBoolean2.get()) {
                break;
                break;
            }
            a2 = this.a.a(bitmapArr[i11]);
            if (a2 != -1) {
                atomicBoolean2.set(true);
            } else if (a2 != 1) {
                for (int i13 = 0; i13 < y; i13++) {
                    CountDownLatch countDownLatch2 = countDownLatchArr[i13];
                    if (countDownLatch2 != null) {
                        try {
                            countDownLatch2.await();
                        } catch (InterruptedException e11) {
                            e11.printStackTrace();
                        }
                    }
                }
                int length = (int) randomAccessFile22.length();
                Collections.sort(arrayList2, Comparator$-CC.comparingInt(new t6(13)));
                xVarArr2[0].b();
                int size = arrayList2.size();
                xVarArr2[0].c(size);
                for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                    xVarArr2[0].c(((d) arrayList2.get(i14)).c);
                    xVarArr2[0].c(((d) arrayList2.get(i14)).b);
                }
                randomAccessFile22.write(xVarArr2[0].a, 0, (size * 8) + 4);
                xVarArr2[0].b();
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
                z.execute(new rr(this, atomicBoolean2, bitmapArr, i11, xVarArr2, i122, randomAccessFile22, arrayList2, countDownLatchArr));
                i11++;
                i122++;
                if (i11 >= y) {
                    i11 = 0;
                }
                this.d.set(i122);
            }
        }
        boolean z102 = v2.a;
        f8.b("cancelled cache generation");
        atomicBoolean2.set(true);
        for (i10 = 0; i10 < y; i10++) {
            CountDownLatch countDownLatch3 = countDownLatchArr[i10];
            if (countDownLatch3 != null) {
                try {
                    countDownLatch3.await();
                } catch (InterruptedException e12) {
                    e12.printStackTrace();
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
        boolean z10 = this.f && Thread.currentThread().getName().startsWith("DispatchQueuePoolThreadSafety_");
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
            i0.h3(this.p, 5000L);
        }
        return bArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x011a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0112  */
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
                            if (this.j) {
                            }
                            return -1;
                        } catch (Throwable th2) {
                            th = th2;
                            f8.g(th, false);
                            i11 = this.n + 1;
                            this.n = i11;
                            if (i11 > 10) {
                            }
                            if (this.j) {
                            }
                            return -1;
                        }
                    }
                    try {
                        if (this.e.size() != 0) {
                            d dVar = (d) this.e.get(Utilities.j(i10, this.e.size() - 1, 0));
                            randomAccessFile.seek(dVar.c);
                            byte[] e = e(dVar);
                            randomAccessFile.readFully(e, 0, dVar.b);
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
                            BitmapFactory.decodeByteArray(e, 0, dVar.b, this.t);
                            if (z10) {
                                Utilities.extractAlpha(this.u, bitmap);
                            }
                            this.t.inBitmap = null;
                            return 0;
                        }
                    } catch (FileNotFoundException unused2) {
                        randomAccessFile2 = randomAccessFile;
                        randomAccessFile = randomAccessFile2;
                        if (this.j && randomAccessFile != null) {
                            try {
                                randomAccessFile.close();
                            } catch (IOException e7) {
                                e7.printStackTrace();
                            }
                        }
                        return -1;
                    } catch (Throwable th3) {
                        th = th3;
                        randomAccessFile2 = randomAccessFile;
                        randomAccessFile = randomAccessFile2;
                        f8.g(th, false);
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
