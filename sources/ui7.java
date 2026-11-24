// default package

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ui7 implements kr5 {
    public static final f8e j = new f8e();
    public final cy2 a;
    public final File b;
    public final ij1 c;
    public final String d;
    public final String e;
    public final String f;
    public final qj7 g;
    public final zeb h;
    public final zeb i;

    public ui7(cy2 cy2Var, File file) {
        cy2Var.getClass();
        this.a = cy2Var;
        this.b = file;
        Object obj = xi7.b;
        this.c = new ij1(new t83(file, null, (byte) 1), k34.a, -2, w11.a, (byte) 0);
        this.d = ".lock";
        this.e = ".version";
        this.f = "fcntl failed: EAGAIN";
        this.g = new qj7();
        this.h = new zeb(new ri7(this, (byte) 1));
        this.i = new zeb(new ri7(this, (byte) 0));
    }

    public static void f(File file) {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                zg.e(file, "Unable to create parent directories of ");
                return;
            }
        }
        if (file.exists()) {
            return;
        }
        file.createNewFile();
    }

    @Override // kr5
    public final Object a(g93 g93Var) {
        if (this.i.b == nf5.d) {
            return srd.c(this.a, new qi7(this, null, (byte) 1), g93Var);
        }
        return new Integer(hda.b.nativeIncrementAndGetCounterValue(((hda) this.i.getValue()).a));
    }

    @Override // kr5
    public final Object b(px2 px2Var) {
        if (this.i.b == nf5.d) {
            return srd.c(this.a, new qi7(this, null, (byte) 0), px2Var);
        }
        return new Integer(hda.b.nativeGetCounterValue(((hda) this.i.getValue()).a));
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0078, code lost:
    
        if (r10.d(r0) != r6) goto L26;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b4 A[Catch: all -> 0x00d8, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x00d8, blocks: (B:16:0x00b4, B:30:0x00d4, B:31:0x00d7), top: B:7:0x0022, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d4 A[Catch: all -> 0x00d8, TRY_ENTER, TryCatch #3 {all -> 0x00d8, blocks: (B:16:0x00b4, B:30:0x00d4, B:31:0x00d7), top: B:7:0x0022, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r8v21, types: [oj7] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.io.Closeable, java.lang.Object, rr4] */
    @Override // kr5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(rr4 rr4Var, px2 px2Var) {
        si7 si7Var;
        Object obj;
        int i;
        ly2 ly2Var;
        qj7 qj7Var;
        rr4 rr4Var2;
        Throwable th;
        Object h;
        oj7 oj7Var;
        rr4 rr4Var3;
        Closeable closeable;
        FileLock fileLock;
        FileLock fileLock2;
        Object invoke;
        oj7 oj7Var2;
        try {
            try {
                try {
                    if (px2Var instanceof si7) {
                        si7Var = (si7) px2Var;
                        int i2 = si7Var.f;
                        if ((i2 & TLObject.FLAG_31) != 0) {
                            si7Var.f = i2 - TLObject.FLAG_31;
                            obj = si7Var.d;
                            i = si7Var.f;
                            ly2Var = ly2.a;
                            if (i != 0) {
                                tue.b(obj);
                                si7Var.a = this;
                                si7Var.b = rr4Var;
                                qj7Var = this.g;
                                si7Var.c = qj7Var;
                                si7Var.f = 1;
                                rr4Var2 = rr4Var;
                            } else {
                                if (i != 1) {
                                    if (i != 2) {
                                        if (i != 3) {
                                            dq9.m("call to 'resume' before 'invoke' with coroutine");
                                            return null;
                                        }
                                        fileLock = (FileLock) si7Var.c;
                                        closeable = (Closeable) si7Var.b;
                                        oj7Var2 = (oj7) si7Var.a;
                                        try {
                                            tue.b(obj);
                                            if (fileLock != null) {
                                                fileLock.release();
                                            }
                                            try {
                                                htd.a(closeable, null);
                                                ((qj7) oj7Var2).f(null);
                                                return obj;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                obj = oj7Var2;
                                                ((qj7) obj).f(null);
                                                throw th;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            if (fileLock != null) {
                                            }
                                            throw th;
                                        }
                                    }
                                    closeable = (Closeable) si7Var.c;
                                    oj7Var = (oj7) si7Var.b;
                                    rr4Var3 = (rr4) si7Var.a;
                                    try {
                                        tue.b(obj);
                                        fileLock2 = (FileLock) obj;
                                        try {
                                            si7Var.a = oj7Var;
                                            si7Var.b = closeable;
                                            si7Var.c = fileLock2;
                                            si7Var.f = 3;
                                            invoke = rr4Var3.invoke(si7Var);
                                            if (invoke != ly2Var) {
                                                oj7Var2 = oj7Var;
                                                fileLock = fileLock2;
                                                obj = invoke;
                                                if (fileLock != null) {
                                                }
                                                htd.a(closeable, null);
                                                ((qj7) oj7Var2).f(null);
                                                return obj;
                                            }
                                            return ly2Var;
                                        } catch (Throwable th4) {
                                            fileLock = fileLock2;
                                            th = th4;
                                            if (fileLock != null) {
                                                fileLock.release();
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        fileLock = null;
                                        if (fileLock != null) {
                                        }
                                        throw th;
                                    }
                                }
                                ?? r8 = (oj7) si7Var.c;
                                rr4 rr4Var4 = (rr4) si7Var.b;
                                ui7 ui7Var = (ui7) si7Var.a;
                                tue.b(obj);
                                qj7Var = r8;
                                this = ui7Var;
                                rr4Var2 = rr4Var4;
                            }
                            FileOutputStream fileOutputStream = new FileOutputStream((File) this.h.getValue());
                            f8e f8eVar = j;
                            si7Var.a = rr4Var2;
                            si7Var.b = qj7Var;
                            si7Var.c = fileOutputStream;
                            si7Var.f = 2;
                            h = f8eVar.h(fileOutputStream, si7Var);
                            if (h != ly2Var) {
                                qj7 qj7Var2 = qj7Var;
                                obj = h;
                                oj7Var = qj7Var2;
                                rr4Var3 = rr4Var2;
                                closeable = fileOutputStream;
                                fileLock2 = (FileLock) obj;
                                si7Var.a = oj7Var;
                                si7Var.b = closeable;
                                si7Var.c = fileLock2;
                                si7Var.f = 3;
                                invoke = rr4Var3.invoke(si7Var);
                                if (invoke != ly2Var) {
                                }
                            }
                            return ly2Var;
                        }
                    }
                    f8e f8eVar2 = j;
                    si7Var.a = rr4Var2;
                    si7Var.b = qj7Var;
                    si7Var.c = fileOutputStream;
                    si7Var.f = 2;
                    h = f8eVar2.h(fileOutputStream, si7Var);
                    if (h != ly2Var) {
                    }
                    return ly2Var;
                } catch (Throwable th6) {
                    th = th6;
                    fileLock = null;
                    if (fileLock != null) {
                    }
                    throw th;
                }
                if (i != 0) {
                }
                FileOutputStream fileOutputStream2 = new FileOutputStream((File) this.h.getValue());
            } catch (Throwable th7) {
                th = th7;
            }
        } catch (Throwable th8) {
            obj = si7Var;
            try {
                throw th8;
            } catch (Throwable th9) {
                htd.a(rr4Var, th8);
                throw th9;
            }
        }
        si7Var = new si7(this, px2Var);
        obj = si7Var.d;
        i = si7Var.f;
        ly2Var = ly2.a;
    }

    @Override // kr5
    public final im4 d() {
        return this.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d4 A[Catch: all -> 0x00f0, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00f0, blocks: (B:15:0x00d4, B:31:0x00ec, B:32:0x00ef), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ec A[Catch: all -> 0x00f0, TRY_ENTER, TryCatch #1 {all -> 0x00f0, blocks: (B:15:0x00d4, B:31:0x00ec, B:32:0x00ef), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r18v0, types: [fs4] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, ti7] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [qj7] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int, java.io.Closeable] */
    @Override // kr5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(fs4 fs4Var, px2 px2Var) {
        ?? r3;
        ?? r4;
        ?? r1;
        qj7 qj7Var;
        FileLock fileLock;
        FileLock fileLock2;
        FileInputStream fileInputStream;
        boolean z;
        try {
            if (px2Var instanceof ti7) {
                ti7 ti7Var = (ti7) px2Var;
                int i = ti7Var.h;
                if ((i & TLObject.FLAG_31) != 0) {
                    ti7Var.h = i - TLObject.FLAG_31;
                    r3 = ti7Var;
                    Object obj = r3.e;
                    r4 = r3.h;
                    if (r4 == 0) {
                        if (r4 == 1) {
                            r1 = r3.d;
                            qj7Var = r3.a;
                            try {
                                tue.b(obj);
                                z = r1;
                                if (z) {
                                    qj7Var.f(null);
                                }
                                return obj;
                            } catch (Throwable th) {
                                th = th;
                                if (r1 != 0) {
                                }
                                throw th;
                            }
                        }
                        if (r4 != 2) {
                            dq9.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        boolean z2 = r3.d;
                        fileLock2 = r3.c;
                        fileInputStream = r3.b;
                        qj7 qj7Var2 = r3.a;
                        try {
                            tue.b(obj);
                            r1 = z2;
                            r3 = qj7Var2;
                            if (fileLock2 != null) {
                                fileLock2.release();
                            }
                            try {
                                htd.a(fileInputStream, null);
                                if (r1 != 0) {
                                    r3.f(null);
                                }
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                                qj7Var = r3;
                                if (r1 != 0) {
                                    qj7Var.f(null);
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            if (fileLock2 != null) {
                            }
                            throw th;
                        }
                    }
                    tue.b(obj);
                    qj7 qj7Var3 = this.g;
                    boolean e = qj7Var3.e();
                    ly2 ly2Var = ly2.a;
                    try {
                        if (e) {
                            FileInputStream fileInputStream2 = new FileInputStream((File) this.h.getValue());
                            try {
                                try {
                                    fileLock = fileInputStream2.getChannel().tryLock(0L, Long.MAX_VALUE, true);
                                } catch (Throwable th4) {
                                    th = th4;
                                    fileLock2 = null;
                                    if (fileLock2 != null) {
                                    }
                                    throw th;
                                }
                            } catch (IOException e2) {
                                String message = e2.getMessage();
                                if (message != null) {
                                    String str = this.f;
                                    str.getClass();
                                    if (message.startsWith(str)) {
                                        fileLock = null;
                                    }
                                }
                                String message2 = e2.getMessage();
                                if (message2 == null || !message2.startsWith("Resource deadlock would occur")) {
                                    throw e2;
                                }
                                fileLock = null;
                            }
                            try {
                                Boolean valueOf = Boolean.valueOf(fileLock != null);
                                r3.a = qj7Var3;
                                r3.b = fileInputStream2;
                                r3.c = fileLock;
                                r3.d = e;
                                r3.h = 2;
                                obj = fs4Var.invoke(valueOf, r3);
                                if (obj != ly2Var) {
                                    fileLock2 = fileLock;
                                    r3 = qj7Var3;
                                    r1 = e;
                                    fileInputStream = fileInputStream2;
                                    if (fileLock2 != null) {
                                    }
                                    htd.a(fileInputStream, null);
                                    if (r1 != 0) {
                                    }
                                    return obj;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                fileLock2 = fileLock;
                                if (fileLock2 != null) {
                                    fileLock2.release();
                                }
                                throw th;
                            }
                        } else {
                            Boolean bool = Boolean.FALSE;
                            r3.a = qj7Var3;
                            r3.d = e;
                            r3.h = 1;
                            obj = fs4Var.invoke(bool, r3);
                            if (obj != ly2Var) {
                                qj7Var = qj7Var3;
                                z = e;
                                if (z) {
                                }
                                return obj;
                            }
                        }
                        return ly2Var;
                    } catch (Throwable th6) {
                        th = th6;
                        qj7Var = qj7Var3;
                        r1 = e;
                        if (r1 != 0) {
                        }
                        throw th;
                    }
                }
            }
            if (r4 == 0) {
            }
        } catch (Throwable th7) {
            try {
                throw th7;
            } catch (Throwable th8) {
                try {
                    htd.a(r4, th7);
                    throw th8;
                } catch (Throwable th9) {
                    th = th9;
                    r1 = this;
                    qj7Var = r3;
                    if (r1 != 0) {
                    }
                    throw th;
                }
            }
        }
        r3 = new ti7(this, px2Var);
        Object obj2 = r3.e;
        r4 = r3.h;
    }
}
