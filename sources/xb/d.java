package xb;

import a7.f;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.support.v4.media.session.a0;
import android.util.Log;
import b8.cg;
import b8.fg;
import b8.hg;
import b8.ig;
import b8.jg;
import b8.kg;
import b8.lb;
import b8.nb;
import b8.ob;
import b8.p1;
import b8.qg;
import b8.tg;
import b8.ug;
import b8.vg;
import b8.wg;
import b8.xg;
import b8.yg;
import b8.zg;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import mb.e;
import mb.g;
import mb.j;
import p6.k;
import p6.m;
import p6.p;
import x7.s;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class d extends e {
    public static final m6.c[] k = {j.c};
    public static final sb.a l = sb.a.a;
    public final Context d;
    public final wb.d e;
    public final hg f;
    public final jg g;
    public boolean h = true;
    public boolean i;
    public tg j;

    public d(g gVar, wb.d dVar, hg hgVar, jg jgVar) {
        m.h(gVar, "MlKitContext can not be null");
        m.h(dVar, "SubjectSegmenterOptions can not be null");
        this.d = gVar.b();
        this.e = dVar;
        this.f = hgVar;
        this.g = jgVar;
    }

    @Override // mb.i
    public final synchronized void b() {
        wg ugVar;
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Context context = this.d;
            m6.c[] cVarArr = k;
            if (!j.a(context, cVarArr)) {
                if (!this.i) {
                    j.c(this.d, cVarArr);
                    this.i = true;
                }
                f(nb.c, elapsedRealtime);
                throw new ib.a("Waiting for the subject segmentation optional module to be downloaded. Please wait.", 14);
            }
            try {
                if (this.j == null) {
                    IBinder b10 = f.c(this.d, f.b, "com.google.android.gms.mlkit_subject_segmentation").b("com.google.android.gms.mlkit.segmentation.subject.SubjectSegmenterCreator");
                    int i3 = vg.a;
                    if (b10 == null) {
                        ugVar = null;
                    } else {
                        IInterface queryLocalInterface = b10.queryLocalInterface("com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenterCreator");
                        ugVar = queryLocalInterface instanceof wg ? (wg) queryLocalInterface : new ug(b10, "com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenterCreator", 0);
                    }
                    z6.b bVar = new z6.b(this.d);
                    this.e.getClass();
                    wb.d dVar = this.e;
                    this.j = ((ug) ugVar).X0(bVar, new zg(false, dVar.a, dVar.b, false, dVar.c));
                }
                try {
                    tg tgVar = this.j;
                    tgVar.getClass();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken(tgVar.c);
                    tgVar.T0(obtain, 1);
                    f(nb.b, elapsedRealtime);
                } catch (RemoteException e10) {
                    f(nb.d, elapsedRealtime);
                    throw new ib.a("Failed to init module subject segmenter", e10);
                }
            } catch (Exception e11) {
                f(nb.f, elapsedRealtime);
                throw new ib.a("Failed to load subject segmentation module", e11);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // mb.i
    public final synchronized void c() {
        try {
            try {
                tg tgVar = this.j;
                if (tgVar != null) {
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken(tgVar.c);
                    tgVar.T0(obtain, 2);
                }
                this.j = null;
            } catch (RemoteException unused) {
                Log.e("SubjectSegmenterTask", "Failed to release subject segmenter");
            }
            this.h = true;
            hg hgVar = this.f;
            ob obVar = ob.R4;
            hgVar.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (hgVar.d(obVar, elapsedRealtime)) {
                hgVar.i.put(obVar, Long.valueOf(elapsedRealtime));
                fa.f fVar = new fa.f(1);
                fVar.d = lb.b;
                mb.m.a.execute(new cg(hgVar, new kg(fVar, 0), obVar, hgVar.c(), 0));
            }
        } finally {
            this.j = null;
        }
    }

    @Override // mb.e
    public final Object e(rb.a aVar) {
        Throwable th2;
        z6.b bVar;
        d dVar;
        rb.a aVar2;
        synchronized (this) {
            try {
                try {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    tg tgVar = this.j;
                    m.g(tgVar);
                    qg qgVar = new qg(aVar.e, aVar.b, aVar.c, SystemClock.elapsedRealtime(), s.a(aVar.d));
                    int i3 = aVar.e;
                    try {
                        if (i3 != -1) {
                            if (i3 != 17) {
                                if (i3 == 35) {
                                    bVar = new z6.b(null);
                                } else if (i3 != 842094169) {
                                    throw new ib.a("Unsupported image format: " + aVar.e, 3);
                                }
                            }
                            m.g(null);
                            throw null;
                        }
                        Bitmap bitmap = aVar.a;
                        m.g(bitmap);
                        bVar = new z6.b(bitmap);
                        try {
                            yg X0 = tgVar.X0(bVar, qgVar);
                            ArrayList arrayList = new ArrayList();
                            if (this.e.b) {
                                for (xg xgVar : X0.a) {
                                    float[] fArr = xgVar.a;
                                    if (fArr != null) {
                                        FloatBuffer allocate = FloatBuffer.allocate(fArr.length);
                                        allocate.put(fArr);
                                        allocate.rewind();
                                    }
                                    arrayList.add(new wb.a(xgVar.b, xgVar.c, xgVar.d, xgVar.e, xgVar.f));
                                }
                            }
                            dVar = this;
                            aVar2 = aVar;
                            try {
                                dVar.g(nb.b, elapsedRealtime, this.h, aVar2, X0);
                                dVar.h = false;
                                float[] fArr2 = X0.b;
                                if (fArr2 != null) {
                                    try {
                                        try {
                                            FloatBuffer allocate2 = FloatBuffer.allocate(fArr2.length);
                                            allocate2.put(fArr2);
                                            allocate2.rewind();
                                        } catch (RemoteException e10) {
                                            e = e10;
                                            dVar.g(nb.e, elapsedRealtime, dVar.h, aVar2, null);
                                            throw new ib.a("Failed to run thin subject segmenter.", e);
                                        }
                                    } catch (RemoteException e11) {
                                        e = e11;
                                    }
                                }
                                return new wb.b(arrayList);
                            } catch (RemoteException e12) {
                                e = e12;
                            }
                        } catch (RemoteException e13) {
                            e = e13;
                            dVar = this;
                            aVar2 = aVar;
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    th2 = th;
                    throw th2;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    public final void f(nb nbVar, long j10) {
        this.f.b(new vi.f(this, nbVar, j10), ob.P4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(nb nbVar, long j10, boolean z10, rb.a aVar, yg ygVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - j10;
        this.f.b(new k.j(this, elapsedRealtime, nbVar, z10, aVar, ygVar), ob.Q4);
        Object[] objArr = 0;
        a0 a0Var = new a0(8, false);
        a0Var.d = this.e.a();
        a0Var.b = nbVar;
        a0Var.c = Boolean.valueOf(z10);
        mb.m.a.execute(new fg(this.f, new p1(a0Var), elapsedRealtime));
        long currentTimeMillis = System.currentTimeMillis();
        long j11 = currentTimeMillis - elapsedRealtime;
        jg jgVar = this.g;
        int i3 = nbVar.a;
        synchronized (jgVar) {
            AtomicLong atomicLong = jgVar.b;
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            if (atomicLong.get() != -1 && elapsedRealtime2 - jgVar.b.get() <= TimeUnit.MINUTES.toMillis(30L)) {
                return;
            }
            jgVar.a.f(new p(0, Arrays.asList(new k(24336, i3, 0, j11, currentTimeMillis, null, null, 0, -1)))).addOnFailureListener(new ig((Object) jgVar, elapsedRealtime2, (int) (objArr == true ? 1 : 0)));
        }
    }
}
