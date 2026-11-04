package ua;

import a3.s;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import b8.ib;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import db.y0;
import e3.i0;
import i2.l;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.voip.r0;
import org.telegram.ui.Components.y00;
import org.telegram.ui.lp0;
import org.telegram.ui.xm0;
import tg.t0;
import w2.c1;
import z9.m;
import zd.n;
import zd.v;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b implements t0, s, SuccessContinuation, zd.b {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ b(int i3) {
        this.a = i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static b a(Context context) {
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
                return new b(0, fileChannel, fileLock);
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

    @Override // a3.s
    public Object L(Uri uri, l lVar) {
        v2.a aVar = (v2.a) ((s) this.b).L(uri, lVar);
        List list = (List) this.c;
        return (list == null || list.isEmpty()) ? aVar : (v2.a) aVar.a(list);
    }

    @Override // tg.t0
    public void N() {
        lp0 lp0Var = (lp0) this.c;
        lp0Var.p0.a.o();
        lp0Var.V0.setViewHidden(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0097  */
    @Override // zd.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object U(zd.c cVar, hd.c cVar2) {
        zd.i iVar;
        int i3;
        b bVar;
        Throwable th2;
        n nVar;
        int i10;
        zd.l lVar;
        switch (this.a) {
            case 11:
                if (cVar2 instanceof zd.i) {
                    iVar = (zd.i) cVar2;
                    int i11 = iVar.b;
                    if ((i11 & TLObject.FLAG_31) != 0) {
                        iVar.b = i11 - TLObject.FLAG_31;
                        Object obj = iVar.a;
                        Object obj2 = gd.a.a;
                        i3 = iVar.b;
                        if (i3 != 0) {
                            ib.b(obj);
                            zd.b bVar2 = (zd.b) this.b;
                            iVar.d = this;
                            iVar.e = cVar;
                            iVar.b = 1;
                            obj = v.b(bVar2, cVar, iVar);
                            if (obj == obj2) {
                                return obj2;
                            }
                            bVar = this;
                        } else {
                            if (i3 != 1) {
                                if (i3 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ib.b(obj);
                                return dd.k.a;
                            }
                            cVar = iVar.e;
                            bVar = iVar.d;
                            ib.b(obj);
                        }
                        th2 = (Throwable) obj;
                        if (th2 != null) {
                            y0 y0Var = (y0) bVar.c;
                            iVar.d = null;
                            iVar.e = null;
                            iVar.b = 2;
                            if (y0Var.a(cVar, th2, iVar) == obj2) {
                                return obj2;
                            }
                        }
                        return dd.k.a;
                    }
                }
                iVar = new zd.i(this, cVar2);
                Object obj3 = iVar.a;
                Object obj22 = gd.a.a;
                i3 = iVar.b;
                if (i3 != 0) {
                }
                th2 = (Throwable) obj3;
                if (th2 != null) {
                }
                return dd.k.a;
            default:
                if (cVar2 instanceof n) {
                    nVar = (n) cVar2;
                    int i12 = nVar.b;
                    if ((i12 & TLObject.FLAG_31) != 0) {
                        nVar.b = i12 - TLObject.FLAG_31;
                        Object obj4 = nVar.a;
                        gd.a aVar = gd.a.a;
                        i10 = nVar.b;
                        if (i10 != 0) {
                            ib.b(obj4);
                            w9.b bVar3 = (w9.b) this.b;
                            zd.l lVar2 = new zd.l((gb.c) this.c, cVar);
                            try {
                                nVar.d = lVar2;
                                nVar.b = 1;
                                if (bVar3.U(lVar2, nVar) == aVar) {
                                    return aVar;
                                }
                            } catch (ae.a e10) {
                                e = e10;
                                lVar = lVar2;
                                if (e.a != lVar) {
                                    throw e;
                                }
                                return dd.k.a;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            lVar = nVar.d;
                            try {
                                ib.b(obj4);
                            } catch (ae.a e11) {
                                e = e11;
                                if (e.a != lVar) {
                                }
                                return dd.k.a;
                            }
                        }
                        return dd.k.a;
                    }
                }
                nVar = new n(this, cVar2);
                Object obj42 = nVar.a;
                gd.a aVar2 = gd.a.a;
                i10 = nVar.b;
                if (i10 != 0) {
                }
                return dd.k.a;
        }
    }

    @Override // tg.t0
    public void Z() {
        lp0 lp0Var = (lp0) this.c;
        if (lp0Var.C0 != null) {
            lp0Var.r0(null, true);
        }
        lp0Var.V0.setViewHidden(true);
    }

    public void b() {
        try {
            ((FileLock) this.c).release();
            ((FileChannel) this.b).close();
        } catch (IOException e10) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e10);
        }
    }

    public i0 c(int i3) {
        int i10 = 0;
        while (true) {
            int[] iArr = (int[]) this.b;
            if (i10 >= iArr.length) {
                g2.a.c("BaseMediaChunkOutput", "Unmatched track of type: " + i3);
                return new e3.n();
            }
            if (i3 == iArr[i10]) {
                return ((c1[]) this.c)[i10];
            }
            i10++;
        }
    }

    @Override // tg.t0
    public void f() {
        ((xm0) this.b).run();
    }

    @Override // tg.t0
    public void k() {
        r0 r0Var = ((lp0) this.c).H0;
        if (r0Var != null) {
            r0Var.invalidate();
        }
    }

    @Override // tg.t0
    public void m() {
        lp0 lp0Var = (lp0) this.c;
        if (lp0Var.U0) {
            lp0Var.U0 = false;
        } else {
            lp0Var.d1.b(1);
            lp0Var.C((tg.h) tg.h.a.get(0));
        }
    }

    @Override // tg.t0
    public boolean q() {
        lp0 lp0Var = (lp0) this.c;
        boolean z10 = lp0Var.C0 == null;
        if (!z10) {
            lp0Var.r0(null, true);
        }
        return z10;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        Boolean bool = (Boolean) obj;
        m mVar = (m) this.c;
        if (bool.booleanValue()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Sending cached crash reports...", null);
            }
            boolean booleanValue = bool.booleanValue();
            z9.s sVar = mVar.b;
            if (booleanValue) {
                sVar.h.trySetResult(null);
                return ((Task) this.b).onSuccessTask(mVar.e.a, new y00(this));
            }
            sVar.getClass();
            throw new IllegalStateException("An invalid data collection token was used.");
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Deleting cached crash reports...", null);
        }
        fa.f fVar = mVar.g;
        Iterator it = fa.f.i(((File) fVar.d).listFiles(m.r)).iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
        fa.f fVar2 = mVar.m.b.b;
        fa.d.b(fa.f.i(((File) fVar2.f).listFiles()));
        fa.d.b(fa.f.i(((File) fVar2.h).listFiles()));
        fa.d.b(fa.f.i(((File) fVar2.n).listFiles()));
        mVar.q.trySetResult(null);
        return Tasks.forResult(null);
    }

    public String toString() {
        switch (this.a) {
            case 6:
                try {
                    if (((zb.b) this.c) == null) {
                        this.c = ((zb.e) this.b).a();
                    }
                    return ((zb.b) this.c).toString();
                } catch (yb.e unused) {
                    return "";
                }
            default:
                return super.toString();
        }
    }

    public /* synthetic */ b(int i3, Object obj, Object obj2) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ b(Object obj, Object obj2, boolean z10, int i3) {
        this.a = i3;
        this.c = obj;
        this.b = obj2;
    }

    public b() {
        this.a = 10;
        this.b = new AtomicInteger();
        this.c = new AtomicInteger();
    }

    public b(zb.e eVar) {
        this.a = 6;
        this.b = eVar;
    }
}
