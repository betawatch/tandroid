package xf;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.Process;
import android.os.StrictMode;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.o80;
import org.telegram.ui.Components.wk0;
import yf.j2;
import yf.m2;
import yf.x1;
import zf.z1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o0(int i9, Object obj, Object obj2) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
    }

    private final void a() {
        y8.o oVar = (y8.o) this.b;
        x9.b bVar = (x9.b) this.c;
        synchronized (oVar) {
            try {
                if (oVar.b == null) {
                    oVar.a.add(bVar);
                } else {
                    oVar.b.add(bVar.get());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        x9.a aVar;
        int i9;
        switch (this.a) {
            case 0:
                q0 q0Var = (q0) this.b;
                x0 x0Var = (x0) this.c;
                q0Var.v = true;
                ByteBuffer byteBuffer = (ByteBuffer) q0Var.h(q0Var.f(), true, false, false).c;
                RectF f10 = q0Var.f();
                Object obj = q0Var.a.b;
                q0Var.w = new a6.a(byteBuffer, 0, f10);
                q0Var.a(false);
                x0Var.run();
                return;
            case 1:
                c1 c1Var = (c1) this.b;
                Runnable runnable = (Runnable) this.c;
                a1 a1Var = c1Var.d;
                if (a1Var == null || !a1Var.f) {
                    return;
                }
                a1.b(a1Var);
                runnable.run();
                return;
            case 2:
                y8.p pVar = (y8.p) this.b;
                x9.b bVar = (x9.b) this.c;
                if (pVar.b != y8.p.d) {
                    throw new IllegalStateException("provide() can be called only once.");
                }
                synchronized (pVar) {
                    aVar = pVar.a;
                    pVar.a = null;
                    pVar.b = bVar;
                }
                aVar.e(bVar);
                return;
            case 3:
                a();
                return;
            case 4:
                yf.l0 l0Var = (yf.l0) this.b;
                x1 x1Var = (x1) this.c;
                x1Var.m();
                l0Var.r0(x1Var, true);
                return;
            case 5:
                ((x1) this.b).s((Bitmap) this.c);
                return;
            case 6:
                m2 m2Var = (m2) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                m2Var.C = false;
                j2[] j2VarArr = (j2[]) arrayList.toArray(new j2[0]);
                m2Var.D = j2VarArr;
                if (j2VarArr.length > 0) {
                    m2Var.U.setScaleX(0.3f);
                    m2Var.U.setScaleY(0.3f);
                    m2Var.U.setAlpha(0.0f);
                    m2Var.U.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).setInterpolator(gr.f).start();
                    return;
                }
                return;
            case 7:
                z8.a aVar2 = (z8.a) this.b;
                Runnable runnable2 = (Runnable) this.c;
                Process.setThreadPriority(aVar2.c);
                StrictMode.ThreadPolicy threadPolicy = aVar2.d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable2.run();
                return;
            case 8:
                Callable callable = (Callable) this.b;
                z8.h hVar = (z8.h) ((n5.a0) this.c).b;
                try {
                    hVar.k(callable.call());
                    return;
                } catch (Exception e10) {
                    hVar.l(e10);
                    return;
                }
            case 9:
                zf.j0 j0Var = (zf.j0) this.b;
                TLObject tLObject = (TLObject) this.c;
                ArrayList arrayList2 = j0Var.e0;
                wk0 wk0Var = j0Var.d;
                if (tLObject != null) {
                    arrayList2.clear();
                    arrayList2.addAll(((TLRPC.TL_messages_chats) tLObject).chats);
                    j0Var.E0 = false;
                    j0Var.F0.b(j0Var.j0 + 4);
                    int i10 = 0;
                    while (true) {
                        if (i10 >= wk0Var.getChildCount()) {
                            i9 = 0;
                        } else if (wk0Var.getChildAt(i10) instanceof zf.i0) {
                            i9 = wk0Var.getChildAt(i10).getTop();
                        } else {
                            i10++;
                        }
                    }
                    j0Var.M1();
                    if (j0Var.h0 >= 0 && i9 != 0) {
                        ((f2.m0) wk0Var.getLayoutManager()).h1(j0Var.h0 + 1, i9);
                    }
                }
                int max = Math.max(arrayList2.size(), j0Var.I0.b);
                j0Var.t0.g(max, false);
                j0Var.t0.setBagePosition(max / j0Var.I0.c);
                zf.h0 h0Var = j0Var.t0;
                h0Var.D = true;
                h0Var.requestLayout();
                return;
            case 10:
                ((zf.j0) this.b).m1((o80) this.c, true);
                return;
            case 11:
                z1 z1Var = (z1) this.b;
                AndroidUtilities.runOnUIThread(new o0(12, z1Var, FileLoader.getInstance(z1Var.s).getPathToAttach((TLRPC.Document) this.c)));
                return;
            default:
                z1 z1Var2 = (z1) this.b;
                z1Var2.e = (File) this.c;
                z1Var2.a();
                return;
        }
    }
}
