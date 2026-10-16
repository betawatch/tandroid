package x9;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Executor;
import r0.i0;
import r0.l1;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class l implements SuccessContinuation, r0.n {
    public Object a;
    public Object b;

    public /* synthetic */ l(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // r0.n
    public l1 Q0(View view, l1 l1Var) {
        z4.g gVar = (z4.g) this.b;
        l1 g10 = i0.g(view, l1Var);
        if (g10.a.n()) {
            return g10;
        }
        Rect rect = (Rect) this.a;
        rect.left = g10.b();
        rect.top = g10.d();
        rect.right = g10.c();
        rect.bottom = g10.a();
        int childCount = gVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            l1 b10 = i0.b(gVar.getChildAt(i10), g10);
            rect.left = Math.min(b10.b(), rect.left);
            rect.top = Math.min(b10.d(), rect.top);
            rect.right = Math.min(b10.c(), rect.right);
            rect.bottom = Math.min(b10.a(), rect.bottom);
        }
        return g10.f(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void a() {
        String str = (String) this.a;
        try {
            ca.c cVar = (ca.c) this.b;
            cVar.getClass();
            new File(cVar.b, str).createNewFile();
        } catch (IOException e) {
            Log.e("FirebaseCrashlytics", "Error creating marker: ".concat(str), e);
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        ea.a aVar = (ea.a) obj;
        u4.f fVar = (u4.f) this.b;
        if (aVar == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
            return Tasks.forResult(null);
        }
        n3.b bVar = (n3.b) fVar.c;
        n3.b bVar2 = (n3.b) fVar.c;
        n.b((n) bVar.c);
        ((n) bVar2.c).m.y((Executor) this.a, null);
        ((n) bVar2.c).q.trySetResult(null);
        return Tasks.forResult(null);
    }
}
