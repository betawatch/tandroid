package z9;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.telegram.messenger.hs;
import org.telegram.messenger.li;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ o(Object obj, Object obj2, Object obj3, int i3) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                p pVar = (p) this.b;
                String str = (String) this.c;
                String str2 = (String) this.d;
                m mVar = pVar.f;
                mVar.getClass();
                try {
                    ((b4.n) mVar.d.d).B(str, str2);
                    return;
                } catch (IllegalArgumentException e10) {
                    Context context = mVar.a;
                    if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                        throw e10;
                    }
                    Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
                    return;
                }
            case 1:
                za.f fVar = (za.f) this.b;
                Intent intent = (Intent) this.c;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.d;
                try {
                    fVar.b(intent);
                    return;
                } finally {
                    taskCompletionSource.setResult(null);
                }
            default:
                zf.d dVar = (zf.d) this.b;
                TLObject tLObject = (TLObject) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                String str3 = dVar.b;
                int i3 = dVar.a;
                if (tLObject != null) {
                    li.b0(i3).i1(str3, (TLRPC.Document) tLObject, false);
                } else {
                    dVar.a();
                    li.b0(i3).i1(str3, null, true);
                    if (tL_error != null) {
                        hs.f(i3).d(new xh.i(10, dVar, tL_error));
                    }
                }
                dVar.a();
                return;
        }
    }
}
