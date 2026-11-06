package t9;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.common.api.internal.t;
import com.google.android.gms.common.api.q;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class c extends t implements e {
    public TaskCompletionSource d;
    public final /* synthetic */ b[] e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b[] bVarArr) {
        super(null, false, 9004);
        this.e = bVarArr;
    }

    @Override // com.google.android.gms.common.api.internal.e
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
                aVar = new r9.a(str);
                break;
            case 17511:
                aVar = new r9.a(str);
                break;
            case 17512:
            default:
                aVar = new db.b(str);
                break;
            case 17513:
                aVar = new r9.a(str);
                break;
            case 17514:
                aVar = new r9.b(str);
                break;
        }
        taskCompletionSource.setException(aVar);
    }

    @Override // com.google.android.gms.common.api.internal.t
    public final void c(com.google.android.gms.common.api.c cVar, TaskCompletionSource taskCompletionSource) {
        this.d = taskCompletionSource;
        s7.a aVar = (s7.a) ((s7.b) cVar).n();
        e7.b bVar = new e7.b(this);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
        int i7 = s7.c.a;
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
