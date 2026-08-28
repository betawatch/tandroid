package x8;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.f;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.common.api.q;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c extends w implements f {
    public TaskCompletionSource d;
    public final /* synthetic */ b[] e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b[] bVarArr) {
        super(null, false, 9004);
        this.e = bVarArr;
    }

    @Override // com.google.android.gms.common.api.internal.f
    public final void a(q qVar) {
        Exception aVar;
        Status status = (Status) qVar;
        if (status.b()) {
            this.d.setResult(null);
            return;
        }
        TaskCompletionSource taskCompletionSource = this.d;
        String str = status.b;
        if (str == null || str.isEmpty()) {
            str = "User Action indexing error, please try again.";
        }
        switch (status.a) {
            case 17510:
                aVar = new v8.a(str);
                break;
            case 17511:
                aVar = new v8.a(str);
                break;
            case 17512:
            default:
                aVar = new s8.c(str);
                break;
            case 17513:
                aVar = new v8.a(str);
                break;
            case 17514:
                aVar = new v8.b(str);
                break;
        }
        taskCompletionSource.setException(aVar);
    }

    @Override // com.google.android.gms.common.api.internal.w
    public final void c(com.google.android.gms.common.api.c cVar, TaskCompletionSource taskCompletionSource) {
        this.d = taskCompletionSource;
        z6.a aVar = (z6.a) ((z6.b) cVar).u();
        l6.b bVar = new l6.b(this);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
        int i9 = z6.c.a;
        obtain.writeStrongBinder(bVar);
        obtain.writeTypedArray(this.e, 0);
        Parcel obtain2 = Parcel.obtain();
        try {
            aVar.a.transact(7, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }
}
