package w9;

import ae.k;
import ae.q;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.support.v4.media.session.a0;
import android.util.Log;
import androidx.lifecycle.t;
import androidx.lifecycle.t0;
import androidx.lifecycle.z;
import b8.df;
import b8.ib;
import ba.i;
import fa.f;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import kotlin.jvm.internal.o;
import l1.m;
import org.telegram.tgnet.TLObject;
import y7.qa;
import zd.h;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b implements zd.b {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0061  */
    @Override // zd.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object U(zd.c cVar, hd.c cVar2) {
        h hVar;
        gd.a aVar;
        int i3;
        Throwable th2;
        k kVar;
        b bVar;
        zd.c cVar3;
        zd.b bVar2;
        switch (this.a) {
            case 6:
                if (cVar2 instanceof h) {
                    hVar = (h) cVar2;
                    int i10 = hVar.b;
                    if ((i10 & TLObject.FLAG_31) != 0) {
                        hVar.b = i10 - TLObject.FLAG_31;
                        Object obj = hVar.a;
                        aVar = gd.a.a;
                        i3 = hVar.b;
                        if (i3 != 0) {
                            ib.b(obj);
                            k kVar2 = new k(cVar, hVar.getContext());
                            try {
                                m mVar = (m) this.b;
                                hVar.d = this;
                                hVar.e = cVar;
                                hVar.f = kVar2;
                                hVar.b = 1;
                                if (mVar.invoke(kVar2, hVar) == aVar) {
                                    return aVar;
                                }
                                bVar = this;
                                cVar3 = cVar;
                                kVar = kVar2;
                            } catch (Throwable th3) {
                                th2 = th3;
                                kVar = kVar2;
                                kVar.releaseIntercepted();
                                throw th2;
                            }
                        } else {
                            if (i3 != 1) {
                                if (i3 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ib.b(obj);
                                return dd.k.a;
                            }
                            kVar = hVar.f;
                            cVar3 = hVar.e;
                            bVar = hVar.d;
                            try {
                                ib.b(obj);
                            } catch (Throwable th4) {
                                th2 = th4;
                                kVar.releaseIntercepted();
                                throw th2;
                            }
                        }
                        kVar.releaseIntercepted();
                        bVar2 = (zd.b) bVar.c;
                        hVar.d = null;
                        hVar.e = null;
                        hVar.f = null;
                        hVar.b = 2;
                        if (bVar2.U(cVar3, hVar) == aVar) {
                            return aVar;
                        }
                        return dd.k.a;
                    }
                }
                hVar = new h(this, cVar2);
                Object obj2 = hVar.a;
                aVar = gd.a.a;
                i3 = hVar.b;
                if (i3 != 0) {
                }
                kVar.releaseIntercepted();
                bVar2 = (zd.b) bVar.c;
                hVar.d = null;
                hVar.e = null;
                hVar.f = null;
                hVar.b = 2;
                if (bVar2.U(cVar3, hVar) == aVar) {
                }
                return dd.k.a;
            default:
                Object U = ((ua.b) this.b).U(new q(new o(), cVar, (ja.b) this.c), cVar2);
                return U == gd.a.a ? U : dd.k.a;
        }
    }

    public void a() {
        String str = (String) this.b;
        try {
            f fVar = (f) this.c;
            fVar.getClass();
            new File((File) fVar.d, str).createNewFile();
        } catch (IOException e10) {
            Log.e("FirebaseCrashlytics", "Error creating marker: ".concat(str), e10);
        }
    }

    public void b(String str, PrintWriter printWriter) {
        y1.b bVar = (y1.b) this.c;
        if (bVar.d.c <= 0) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Loaders:");
        String str2 = str + "    ";
        int i3 = 0;
        while (true) {
            a0.m mVar = bVar.d;
            if (i3 >= mVar.c) {
                return;
            }
            y1.a aVar = (y1.a) mVar.b[i3];
            printWriter.print(str);
            printWriter.print("  #");
            printWriter.print(bVar.d.a[i3]);
            printWriter.print(": ");
            printWriter.println(aVar.toString());
            printWriter.print(str2);
            printWriter.print("mId=");
            printWriter.print(0);
            printWriter.print(" mArgs=");
            printWriter.println((Object) null);
            printWriter.print(str2);
            printWriter.print("mLoader=");
            printWriter.println(aVar.l);
            c6.d dVar = aVar.l;
            String str3 = str2 + "  ";
            dVar.getClass();
            printWriter.print(str3);
            printWriter.print("mId=");
            printWriter.print(0);
            printWriter.print(" mListener=");
            printWriter.println(dVar.a);
            if (dVar.b || dVar.e) {
                printWriter.print(str3);
                printWriter.print("mStarted=");
                printWriter.print(dVar.b);
                printWriter.print(" mContentChanged=");
                printWriter.print(dVar.e);
                printWriter.print(" mProcessingChange=");
                printWriter.println(false);
            }
            if (dVar.c || dVar.d) {
                printWriter.print(str3);
                printWriter.print("mAbandoned=");
                printWriter.print(dVar.c);
                printWriter.print(" mReset=");
                printWriter.println(dVar.d);
            }
            if (dVar.g != null) {
                printWriter.print(str3);
                printWriter.print("mTask=");
                printWriter.print(dVar.g);
                printWriter.print(" waiting=");
                dVar.g.getClass();
                printWriter.println(false);
            }
            if (dVar.h != null) {
                printWriter.print(str3);
                printWriter.print("mCancellingTask=");
                printWriter.print(dVar.h);
                printWriter.print(" waiting=");
                dVar.h.getClass();
                printWriter.println(false);
            }
            if (aVar.n != null) {
                printWriter.print(str2);
                printWriter.print("mCallbacks=");
                printWriter.println(aVar.n);
                i iVar = aVar.n;
                iVar.getClass();
                printWriter.print(str2 + "  ");
                printWriter.print("mDeliveredData=");
                printWriter.println(iVar.b);
            }
            printWriter.print(str2);
            printWriter.print("mData=");
            c6.d dVar2 = aVar.l;
            Object obj = aVar.e;
            Object obj2 = obj != z.k ? obj : null;
            dVar2.getClass();
            StringBuilder sb2 = new StringBuilder(64);
            if (obj2 == null) {
                sb2.append("null");
            } else {
                Class<?> cls = obj2.getClass();
                sb2.append(cls.getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(cls)));
                sb2.append("}");
            }
            printWriter.println(sb2.toString());
            printWriter.print(str2);
            printWriter.print("mStarted=");
            printWriter.println(aVar.c > 0);
            i3++;
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                StringBuilder sb2 = new StringBuilder(128);
                sb2.append("LoaderManager{");
                sb2.append(Integer.toHexString(System.identityHashCode(this)));
                sb2.append(" in ");
                Class<?> cls = ((t) this.b).getClass();
                sb2.append(cls.getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(cls)));
                sb2.append("}}");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ b(int i3, Object obj, Object obj2) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
    }

    public b(p7.d dVar) {
        this.a = 2;
        this.c = new df();
        this.b = dVar;
        qa.b();
    }

    public b(Context context) {
        this.a = 0;
        this.b = context;
        this.c = null;
    }

    public b(t tVar, t0 t0Var) {
        this.a = 1;
        this.b = tVar;
        this.c = (y1.b) new a0(t0Var, y1.b.f).h(y1.b.class);
    }

    public b(int i3) {
        this.a = 3;
        Bitmap createBitmap = Bitmap.createBitmap(i3, i3, Bitmap.Config.ALPHA_8);
        this.b = createBitmap;
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        this.c = new BitmapShader(createBitmap, tileMode, tileMode);
    }
}
