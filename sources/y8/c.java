package y8;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.f;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.common.api.q;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
                aVar = new w8.a(str);
                break;
            case 17511:
                aVar = new w8.a(str);
                break;
            case 17512:
            default:
                aVar = new t8.c(str);
                break;
            case 17513:
                aVar = new w8.a(str);
                break;
            case 17514:
                aVar = new w8.b(str);
                break;
        }
        taskCompletionSource.setException(aVar);
    }

    @Override // com.google.android.gms.common.api.internal.w
    public final void c(com.google.android.gms.common.api.c cVar, TaskCompletionSource taskCompletionSource) {
        this.d = taskCompletionSource;
        a7.a aVar = (a7.a) ((a7.b) cVar).u();
        m6.b bVar = new m6.b(this);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
        int i10 = a7.d.a;
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
