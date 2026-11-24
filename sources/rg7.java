// default package

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class rg7 implements kp5 {
    public static final c6e j = new c6e();
    public final sw2 a;
    public final File b;
    public final bi1 c;
    public final String d;
    public final String e;
    public final String f;
    public final nh7 g;
    public final ycb h;
    public final ycb i;

    public rg7(sw2 sw2Var, File file) {
        sw2Var.getClass();
        this.a = sw2Var;
        this.b = file;
        Object obj = ug7.b;
        this.c = new bi1(new h73(file, null, (byte) 1), z14.a, -2, o01.a, (byte) 0);
        this.d = ".lock";
        this.e = ".version";
        this.f = "fcntl failed: EAGAIN";
        this.g = new nh7();
        this.h = new ycb(new og7(this, (byte) 1));
        this.i = new ycb(new og7(this, (byte) 0));
    }

    public static void f(File file) {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                ag.e(file, "Unable to create parent directories of ");
                return;
            }
        }
        if (file.exists()) {
            return;
        }
        file.createNewFile();
    }

    @Override // kp5
    public final Object a(u73 u73Var) {
        if (this.i.b == pd5.d) {
            return ppd.c(this.a, new ng7(this, null, (byte) 1), u73Var);
        }
        return new Integer(hba.b.nativeIncrementAndGetCounterValue(((hba) this.i.getValue()).a));
    }

    @Override // kp5
    public final Object b(fw2 fw2Var) {
        if (this.i.b == pd5.d) {
            return ppd.c(this.a, new ng7(this, null, (byte) 0), fw2Var);
        }
        return new Integer(hba.b.nativeGetCounterValue(((hba) this.i.getValue()).a));
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
    /* JADX WARN: Type inference failed for: r8v21, types: [lh7] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.io.Closeable, java.lang.Object, qp4] */
    @Override // kp5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(qp4 qp4Var, fw2 fw2Var) {
        pg7 pg7Var;
        Object obj;
        int i;
        bx2 bx2Var;
        nh7 nh7Var;
        qp4 qp4Var2;
        Throwable th;
        Object h;
        lh7 lh7Var;
        qp4 qp4Var3;
        Closeable closeable;
        FileLock fileLock;
        FileLock fileLock2;
        Object invoke;
        lh7 lh7Var2;
        try {
            try {
                try {
                    if (fw2Var instanceof pg7) {
                        pg7Var = (pg7) fw2Var;
                        int i2 = pg7Var.f;
                        if ((i2 & TLObject.FLAG_31) != 0) {
                            pg7Var.f = i2 - TLObject.FLAG_31;
                            obj = pg7Var.d;
                            i = pg7Var.f;
                            bx2Var = bx2.a;
                            if (i != 0) {
                                qse.b(obj);
                                pg7Var.a = this;
                                pg7Var.b = qp4Var;
                                nh7Var = this.g;
                                pg7Var.c = nh7Var;
                                pg7Var.f = 1;
                                qp4Var2 = qp4Var;
                            } else {
                                if (i != 1) {
                                    if (i != 2) {
                                        if (i != 3) {
                                            sc8.j("call to 'resume' before 'invoke' with coroutine");
                                            return null;
                                        }
                                        fileLock = (FileLock) pg7Var.c;
                                        closeable = (Closeable) pg7Var.b;
                                        lh7Var2 = (lh7) pg7Var.a;
                                        try {
                                            qse.b(obj);
                                            if (fileLock != null) {
                                                fileLock.release();
                                            }
                                            try {
                                                erd.a(closeable, null);
                                                ((nh7) lh7Var2).f(null);
                                                return obj;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                obj = lh7Var2;
                                                ((nh7) obj).f(null);
                                                throw th;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            if (fileLock != null) {
                                            }
                                            throw th;
                                        }
                                    }
                                    closeable = (Closeable) pg7Var.c;
                                    lh7Var = (lh7) pg7Var.b;
                                    qp4Var3 = (qp4) pg7Var.a;
                                    try {
                                        qse.b(obj);
                                        fileLock2 = (FileLock) obj;
                                        try {
                                            pg7Var.a = lh7Var;
                                            pg7Var.b = closeable;
                                            pg7Var.c = fileLock2;
                                            pg7Var.f = 3;
                                            invoke = qp4Var3.invoke(pg7Var);
                                            if (invoke != bx2Var) {
                                                lh7Var2 = lh7Var;
                                                fileLock = fileLock2;
                                                obj = invoke;
                                                if (fileLock != null) {
                                                }
                                                erd.a(closeable, null);
                                                ((nh7) lh7Var2).f(null);
                                                return obj;
                                            }
                                            return bx2Var;
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
                                ?? r8 = (lh7) pg7Var.c;
                                qp4 qp4Var4 = (qp4) pg7Var.b;
                                rg7 rg7Var = (rg7) pg7Var.a;
                                qse.b(obj);
                                nh7Var = r8;
                                this = rg7Var;
                                qp4Var2 = qp4Var4;
                            }
                            FileOutputStream fileOutputStream = new FileOutputStream((File) this.h.getValue());
                            c6e c6eVar = j;
                            pg7Var.a = qp4Var2;
                            pg7Var.b = nh7Var;
                            pg7Var.c = fileOutputStream;
                            pg7Var.f = 2;
                            h = c6eVar.h(fileOutputStream, pg7Var);
                            if (h != bx2Var) {
                                nh7 nh7Var2 = nh7Var;
                                obj = h;
                                lh7Var = nh7Var2;
                                qp4Var3 = qp4Var2;
                                closeable = fileOutputStream;
                                fileLock2 = (FileLock) obj;
                                pg7Var.a = lh7Var;
                                pg7Var.b = closeable;
                                pg7Var.c = fileLock2;
                                pg7Var.f = 3;
                                invoke = qp4Var3.invoke(pg7Var);
                                if (invoke != bx2Var) {
                                }
                            }
                            return bx2Var;
                        }
                    }
                    c6e c6eVar2 = j;
                    pg7Var.a = qp4Var2;
                    pg7Var.b = nh7Var;
                    pg7Var.c = fileOutputStream;
                    pg7Var.f = 2;
                    h = c6eVar2.h(fileOutputStream, pg7Var);
                    if (h != bx2Var) {
                    }
                    return bx2Var;
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
            obj = pg7Var;
            try {
                throw th8;
            } catch (Throwable th9) {
                erd.a(qp4Var, th8);
                throw th9;
            }
        }
        pg7Var = new pg7(this, fw2Var);
        obj = pg7Var.d;
        i = pg7Var.f;
        bx2Var = bx2.a;
    }

    @Override // kp5
    public final hk4 d() {
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
    /* JADX WARN: Type inference failed for: r18v0, types: [eq4] */
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
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, qg7] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [nh7] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int, java.io.Closeable] */
    @Override // kp5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(eq4 eq4Var, fw2 fw2Var) {
        ?? r3;
        ?? r4;
        ?? r1;
        nh7 nh7Var;
        FileLock fileLock;
        FileLock fileLock2;
        FileInputStream fileInputStream;
        boolean z;
        try {
            if (fw2Var instanceof qg7) {
                qg7 qg7Var = (qg7) fw2Var;
                int i = qg7Var.h;
                if ((i & TLObject.FLAG_31) != 0) {
                    qg7Var.h = i - TLObject.FLAG_31;
                    r3 = qg7Var;
                    Object obj = r3.e;
                    r4 = r3.h;
                    if (r4 == 0) {
                        if (r4 == 1) {
                            r1 = r3.d;
                            nh7Var = r3.a;
                            try {
                                qse.b(obj);
                                z = r1;
                                if (z) {
                                    nh7Var.f(null);
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
                            sc8.j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        boolean z2 = r3.d;
                        fileLock2 = r3.c;
                        fileInputStream = r3.b;
                        nh7 nh7Var2 = r3.a;
                        try {
                            qse.b(obj);
                            r1 = z2;
                            r3 = nh7Var2;
                            if (fileLock2 != null) {
                                fileLock2.release();
                            }
                            try {
                                erd.a(fileInputStream, null);
                                if (r1 != 0) {
                                    r3.f(null);
                                }
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                                nh7Var = r3;
                                if (r1 != 0) {
                                    nh7Var.f(null);
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
                    qse.b(obj);
                    nh7 nh7Var3 = this.g;
                    boolean e = nh7Var3.e();
                    bx2 bx2Var = bx2.a;
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
                                r3.a = nh7Var3;
                                r3.b = fileInputStream2;
                                r3.c = fileLock;
                                r3.d = e;
                                r3.h = 2;
                                obj = eq4Var.invoke(valueOf, r3);
                                if (obj != bx2Var) {
                                    fileLock2 = fileLock;
                                    r3 = nh7Var3;
                                    r1 = e;
                                    fileInputStream = fileInputStream2;
                                    if (fileLock2 != null) {
                                    }
                                    erd.a(fileInputStream, null);
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
                            r3.a = nh7Var3;
                            r3.d = e;
                            r3.h = 1;
                            obj = eq4Var.invoke(bool, r3);
                            if (obj != bx2Var) {
                                nh7Var = nh7Var3;
                                z = e;
                                if (z) {
                                }
                                return obj;
                            }
                        }
                        return bx2Var;
                    } catch (Throwable th6) {
                        th = th6;
                        nh7Var = nh7Var3;
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
                    erd.a(r4, th7);
                    throw th8;
                } catch (Throwable th9) {
                    th = th9;
                    r1 = this;
                    nh7Var = r3;
                    if (r1 != 0) {
                    }
                    throw th;
                }
            }
        }
        r3 = new qg7(this, fw2Var);
        Object obj2 = r3.e;
        r4 = r3.h;
    }
}
