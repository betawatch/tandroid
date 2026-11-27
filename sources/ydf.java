// default package

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class ydf extends xjb implements kg0 {
    public TaskCompletionSource d;
    public final /* synthetic */ wld[] e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ydf(wld[] wldVarArr) {
        super(null, false, 9004);
        this.e = wldVarArr;
    }

    @Override // kg0
    public final void a(ie9 ie9Var) {
        Exception ki4Var;
        Status status = (Status) ie9Var;
        boolean b = status.b();
        TaskCompletionSource taskCompletionSource = this.d;
        if (b) {
            taskCompletionSource.setResult(null);
            return;
        }
        String str = status.b;
        if (str == null || str.isEmpty()) {
            str = "User Action indexing error, please try again.";
        }
        switch (status.a) {
            case 17510:
                ki4Var = new ki4(str);
                break;
            case 17511:
                ki4Var = new ki4(str);
                break;
            case 17512:
            default:
                ki4Var = new fi4(str);
                break;
            case 17513:
                ki4Var = new ki4(str);
                break;
            case 17514:
                ki4Var = new r9d(str);
                break;
        }
        taskCompletionSource.setException(ki4Var);
    }

    @Override // xjb
    public final void c(d05 d05Var, TaskCompletionSource taskCompletionSource) {
        this.d = taskCompletionSource;
        aad aadVar = (aad) ((bbd) d05Var).k();
        p53 p53Var = new p53(this);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
        int i = gld.a;
        obtain.writeStrongBinder(p53Var);
        obtain.writeTypedArray(this.e, 0);
        Parcel obtain2 = Parcel.obtain();
        try {
            aadVar.a.transact(7, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }
}
