package p9;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.f;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.common.api.q;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
                aVar = new n9.a(str);
                break;
            case 17511:
                aVar = new n9.a(str);
                break;
            case 17512:
            default:
                aVar = new k9.c(str);
                break;
            case 17513:
                aVar = new n9.a(str);
                break;
            case 17514:
                aVar = new n9.b(str);
                break;
        }
        taskCompletionSource.setException(aVar);
    }

    @Override // com.google.android.gms.common.api.internal.w
    public final void f(com.google.android.gms.common.api.c cVar, TaskCompletionSource taskCompletionSource) {
        this.d = taskCompletionSource;
        p7.a aVar = (p7.a) ((p7.b) cVar).u();
        b7.b bVar = new b7.b(this);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
        int i10 = p7.c.a;
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
