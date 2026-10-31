package u9;

import ad.j;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import bb.y;
import c3.k0;
import c3.n;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import m5.e;
import n6.p;
import org.telegram.tgnet.TLObject;
import r0.h0;
import r0.j1;
import r0.m;
import u2.c1;
import x7.g8;
import yc.i;
import z4.g;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class b implements wd.b, SuccessContinuation, we.b, m {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ b(int i10) {
        this.a = i10;
    }

    @Override // r0.m
    public j1 R0(View view, j1 j1Var) {
        g gVar = (g) this.c;
        j1 g10 = h0.g(view, j1Var);
        if (g10.a.n()) {
            return g10;
        }
        Rect rect = (Rect) this.b;
        rect.left = g10.b();
        rect.top = g10.d();
        rect.right = g10.c();
        rect.bottom = g10.a();
        int childCount = gVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            j1 b10 = h0.b(gVar.getChildAt(i10), g10);
            rect.left = Math.min(b10.b(), rect.left);
            rect.top = Math.min(b10.d(), rect.top);
            rect.right = Math.min(b10.c(), rect.right);
            rect.bottom = Math.min(b10.a(), rect.bottom);
        }
        return g10.f(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // we.b
    public we.a a(e eVar) {
        List list = (List) this.c;
        List list2 = (List) eVar.b;
        int size = list2 != null ? list2.size() : 0;
        if (size > 0) {
            ArrayList arrayList = new ArrayList(list.size() + size);
            arrayList.addAll(list);
            arrayList.addAll(list2);
            list = arrayList;
        }
        return new i(eVar, (List) this.b, list);
    }

    public void b() {
        String str = (String) this.b;
        try {
            ca.c cVar = (ca.c) this.c;
            cVar.getClass();
            new File(cVar.b, str).createNewFile();
        } catch (IOException e) {
            Log.e("FirebaseCrashlytics", "Error creating marker: ".concat(str), e);
        }
    }

    public k0 c(int i10) {
        int i11 = 0;
        while (true) {
            int[] iArr = (int[]) this.b;
            if (i11 >= iArr.length) {
                e2.a.c("BaseMediaChunkOutput", "Unmatched track of type: " + i10);
                return new n();
            }
            if (i10 == iArr[i11]) {
                return ((c1[]) this.c)[i11];
            }
            i11++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        if (r2.a(r6, r7, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // wd.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object p(wd.c cVar, ed.c cVar2) {
        wd.d dVar;
        int i10;
        b bVar;
        Throwable th2;
        if (cVar2 instanceof wd.d) {
            dVar = (wd.d) cVar2;
            int i11 = dVar.b;
            if ((i11 & TLObject.FLAG_31) != 0) {
                dVar.b = i11 - TLObject.FLAG_31;
                Object obj = dVar.a;
                Object obj2 = dd.a.a;
                i10 = dVar.b;
                if (i10 != 0) {
                    l9.b.b(obj);
                    wd.b bVar2 = (wd.b) this.b;
                    dVar.d = this;
                    dVar.e = cVar;
                    dVar.b = 1;
                    obj = wd.n.a(bVar2, cVar, dVar);
                    if (obj != obj2) {
                        bVar = this;
                    }
                    return obj2;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    l9.b.b(obj);
                    return j.a;
                }
                cVar = dVar.e;
                bVar = dVar.d;
                l9.b.b(obj);
                th2 = (Throwable) obj;
                if (th2 != null) {
                    y yVar = (y) bVar.c;
                    dVar.d = null;
                    dVar.e = null;
                    dVar.b = 2;
                }
                return j.a;
            }
        }
        dVar = new wd.d(this, cVar2);
        Object obj3 = dVar.a;
        Object obj22 = dd.a.a;
        i10 = dVar.b;
        if (i10 != 0) {
        }
        th2 = (Throwable) obj3;
        if (th2 != null) {
        }
        return j.a;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        ea.c cVar = (ea.c) obj;
        pb.d dVar = (pb.d) this.c;
        if (cVar == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
            return Tasks.forResult(null);
        }
        g8 g8Var = (g8) dVar.c;
        g8 g8Var2 = (g8) dVar.c;
        x9.n.b((x9.n) g8Var.c);
        ((x9.n) g8Var2.c).m.w((Executor) this.b, null);
        ((x9.n) g8Var2.c).q.trySetResult(null);
        return Tasks.forResult(null);
    }

    public String toString() {
        switch (this.a) {
            case 2:
                try {
                    if (((wb.b) this.c) == null) {
                        this.c = ((wb.e) this.b).a();
                    }
                    return ((wb.b) this.c).toString();
                } catch (vb.e unused) {
                    return "";
                }
            default:
                return super.toString();
        }
    }

    public /* synthetic */ b(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    public b(wb.e eVar) {
        this.a = 2;
        this.b = eVar;
    }

    public b(Context context, int i10) {
        this.a = i10;
        switch (i10) {
            case 6:
                this.c = new AtomicLong(-1L);
                this.b = new p6.b(context, p6.b.k, new p("mlkit:vision"), com.google.android.gms.common.api.i.c);
                break;
            default:
                this.b = context;
                this.c = null;
                break;
        }
    }

    public b(pb.d dVar, Executor executor) {
        this.a = 7;
        this.c = dVar;
        this.b = executor;
    }

    public b(g gVar) {
        this.a = 10;
        this.c = gVar;
        this.b = new Rect();
    }
}
