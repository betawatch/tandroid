// default package

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zgd implements ihd, pjf, s99 {
    public static final hce a(Object obj, Object obj2) {
        hce hceVar = (hce) obj;
        hce hceVar2 = (hce) obj2;
        if (!hceVar2.isEmpty()) {
            if (!hceVar.a) {
                if (hceVar.isEmpty()) {
                    hceVar = new hce();
                } else {
                    hce hceVar3 = new hce(hceVar);
                    hceVar3.a = true;
                    hceVar = hceVar3;
                }
            }
            hceVar.c();
            if (!hceVar2.isEmpty()) {
                hceVar.putAll(hceVar2);
            }
        }
        return hceVar;
    }

    @Override // s99
    public final void accept(Object obj, Object obj2) {
        che cheVar = (che) ((qlf) obj).k();
        l3e l3eVar = new l3e((TaskCompletionSource) obj2, (byte) 2);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        int i = amd.a;
        obtain.writeStrongBinder(l3eVar);
        Parcel obtain2 = Parcel.obtain();
        try {
            cheVar.a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    @Override // ihd
    public final byte[] c(int i, int i2, byte[] bArr) {
        return Arrays.copyOfRange(bArr, i, i2 + i);
    }
}
