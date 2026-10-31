package ub;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import c3.g0;
import com.google.android.gms.internal.cast.o;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import jb.e;
import jb.g;
import jb.j;
import jb.m;
import m.p3;
import n6.l;
import v7.y8;
import w7.o6;
import x7.ea;
import z7.bg;
import z7.eg;
import z7.fb;
import z7.fg;
import z7.gb;
import z7.gg;
import z7.hb;
import z7.hg;
import z7.i1;
import z7.ig;
import z7.jg;
import z7.kg;
import z7.xf;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class d extends e {
    public static final k6.c[] k = {j.c};
    public static final pb.a l = pb.a.a;
    public final Context d;
    public final tb.d e;
    public final xf f;
    public final y8 g;
    public boolean h = true;
    public boolean i;
    public eg j;

    public d(g gVar, tb.d dVar, xf xfVar, y8 y8Var) {
        l.h(gVar, "MlKitContext can not be null");
        l.h(dVar, "SubjectSegmenterOptions can not be null");
        this.d = gVar.b();
        this.e = dVar;
        this.f = xfVar;
        this.g = y8Var;
    }

    @Override // jb.i
    public final synchronized void b() {
        hg fgVar;
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Context context = this.d;
            k6.c[] cVarArr = k;
            if (!j.a(context, cVarArr)) {
                if (!this.i) {
                    j.c(this.d, cVarArr);
                    this.i = true;
                }
                f(gb.c, elapsedRealtime);
                throw new fb.a("Waiting for the subject segmentation optional module to be downloaded. Please wait.", 14);
            }
            try {
                if (this.j == null) {
                    IBinder b10 = y6.e.c(this.d, y6.e.b, "com.google.android.gms.mlkit_subject_segmentation").b("com.google.android.gms.mlkit.segmentation.subject.SubjectSegmenterCreator");
                    int i10 = gg.a;
                    if (b10 == null) {
                        fgVar = null;
                    } else {
                        IInterface queryLocalInterface = b10.queryLocalInterface("com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenterCreator");
                        fgVar = queryLocalInterface instanceof hg ? (hg) queryLocalInterface : new fg(b10, "com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenterCreator", 11);
                    }
                    x6.b bVar = new x6.b(this.d);
                    this.e.getClass();
                    tb.d dVar = this.e;
                    this.j = ((fg) fgVar).X0(bVar, new kg(false, dVar.a, dVar.b, false, dVar.c));
                }
                try {
                    eg egVar = this.j;
                    egVar.getClass();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken(egVar.c);
                    egVar.T0(obtain, 1);
                    f(gb.b, elapsedRealtime);
                } catch (RemoteException e) {
                    f(gb.d, elapsedRealtime);
                    throw new fb.a("Failed to init module subject segmenter", e);
                }
            } catch (Exception e7) {
                f(gb.f, elapsedRealtime);
                throw new fb.a("Failed to load subject segmentation module", e7);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // jb.i
    public final synchronized void c() {
        try {
            try {
                eg egVar = this.j;
                if (egVar != null) {
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken(egVar.c);
                    egVar.T0(obtain, 2);
                }
                this.j = null;
            } catch (RemoteException unused) {
                Log.e("SubjectSegmenterTask", "Failed to release subject segmenter");
            }
            this.h = true;
            xf xfVar = this.f;
            hb hbVar = hb.Q4;
            xfVar.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (xfVar.d(hbVar, elapsedRealtime)) {
                xfVar.i.put(hbVar, Long.valueOf(elapsedRealtime));
                p3 p3Var = new p3();
                p3Var.c = fb.b;
                m.a.execute(new o(xfVar, new a5.a(p3Var, 0), hbVar, xfVar.c(), 8));
            }
        } finally {
            this.j = null;
        }
    }

    @Override // jb.e
    public final Object e(ob.a aVar) {
        Throwable th2;
        x6.b bVar;
        d dVar;
        ob.a aVar2;
        synchronized (this) {
            try {
                try {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    eg egVar = this.j;
                    l.g(egVar);
                    bg bgVar = new bg(aVar.e, aVar.b, aVar.c, SystemClock.elapsedRealtime(), o6.a(aVar.d));
                    int i10 = aVar.e;
                    try {
                        if (i10 != -1) {
                            if (i10 != 17) {
                                if (i10 == 35) {
                                    bVar = new x6.b(null);
                                } else if (i10 != 842094169) {
                                    throw new fb.a("Unsupported image format: " + aVar.e, 3);
                                }
                            }
                            l.g(null);
                            throw null;
                        }
                        Bitmap bitmap = aVar.a;
                        l.g(bitmap);
                        bVar = new x6.b(bitmap);
                        try {
                            jg X0 = egVar.X0(bVar, bgVar);
                            ArrayList arrayList = new ArrayList();
                            if (this.e.b) {
                                for (ig igVar : X0.a) {
                                    float[] fArr = igVar.a;
                                    if (fArr != null) {
                                        FloatBuffer allocate = FloatBuffer.allocate(fArr.length);
                                        allocate.put(fArr);
                                        allocate.rewind();
                                    }
                                    arrayList.add(new tb.a(igVar.b, igVar.c, igVar.d, igVar.e, igVar.f));
                                }
                            }
                            dVar = this;
                            aVar2 = aVar;
                            try {
                                dVar.g(gb.b, elapsedRealtime, this.h, aVar2, X0);
                                dVar.h = false;
                                float[] fArr2 = X0.b;
                                if (fArr2 != null) {
                                    try {
                                        try {
                                            FloatBuffer allocate2 = FloatBuffer.allocate(fArr2.length);
                                            allocate2.put(fArr2);
                                            allocate2.rewind();
                                        } catch (RemoteException e) {
                                            e = e;
                                            dVar.g(gb.e, elapsedRealtime, dVar.h, aVar2, null);
                                            throw new fb.a("Failed to run thin subject segmenter.", e);
                                        }
                                    } catch (RemoteException e7) {
                                        e = e7;
                                    }
                                }
                                return new tb.b(arrayList);
                            } catch (RemoteException e10) {
                                e = e10;
                            }
                        } catch (RemoteException e11) {
                            e = e11;
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

    public final void f(gb gbVar, long j10) {
        this.f.b(new ki.g(this, gbVar, j10), hb.O4);
    }

    public final void g(gb gbVar, long j10, boolean z10, ob.a aVar, jg jgVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - j10;
        this.f.b(new k.j(this, elapsedRealtime, gbVar, z10, aVar, jgVar), hb.P4);
        q5.d dVar = new q5.d(28, false);
        dVar.d = this.e.a();
        dVar.b = gbVar;
        dVar.c = Boolean.valueOf(z10);
        m.a.execute(new ea(this.f, new i1(dVar), elapsedRealtime));
        long currentTimeMillis = System.currentTimeMillis();
        long j11 = currentTimeMillis - elapsedRealtime;
        y8 y8Var = this.g;
        int i10 = gbVar.a;
        synchronized (y8Var) {
            AtomicLong atomicLong = y8Var.b;
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            if (atomicLong.get() != -1 && elapsedRealtime2 - y8Var.b.get() <= TimeUnit.MINUTES.toMillis(30L)) {
                return;
            }
            y8Var.a.f(new n6.o(0, Arrays.asList(new n6.j(24336, i10, 0, j11, currentTimeMillis, null, null, 0, -1)))).addOnFailureListener(new g0(y8Var, elapsedRealtime2, 11));
        }
    }
}
