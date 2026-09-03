package q5;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.HashMap;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final /* synthetic */ class b0 implements com.google.android.gms.common.api.internal.s {
    public final /* synthetic */ int a;
    public final /* synthetic */ f0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public /* synthetic */ b0(f0 f0Var, String str, String str2, int i10) {
        this.a = i10;
        this.b = f0Var;
        this.c = str;
        this.d = str2;
    }

    @Override // com.google.android.gms.common.api.internal.s
    public final void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                f0 f0Var = this.b;
                String str = this.c;
                String str2 = this.d;
                u5.x xVar = (u5.x) obj;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                b6.m.j("Not connected to device", f0Var.F == 2);
                u5.f fVar = (u5.f) xVar.u();
                Parcel M0 = fVar.M0();
                M0.writeString(str);
                M0.writeString(str2);
                int i10 = com.google.android.gms.internal.cast.s.a;
                M0.writeInt(0);
                fVar.R0(M0, 14);
                synchronized (f0Var.r) {
                    try {
                        if (f0Var.o != null) {
                            f0Var.i(2477);
                        }
                        f0Var.o = taskCompletionSource;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            default:
                f0 f0Var2 = this.b;
                String str3 = this.c;
                String str4 = this.d;
                u5.x xVar2 = (u5.x) obj;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) obj2;
                HashMap hashMap = f0Var2.B;
                long incrementAndGet = f0Var2.q.incrementAndGet();
                b6.m.j("Not connected to device", f0Var2.F == 2);
                try {
                    hashMap.put(Long.valueOf(incrementAndGet), taskCompletionSource2);
                    u5.f fVar2 = (u5.f) xVar2.u();
                    Parcel M02 = fVar2.M0();
                    M02.writeString(str3);
                    M02.writeString(str4);
                    M02.writeLong(incrementAndGet);
                    fVar2.R0(M02, 9);
                    return;
                } catch (RemoteException e6) {
                    hashMap.remove(Long.valueOf(incrementAndGet));
                    taskCompletionSource2.setException(e6);
                    return;
                }
        }
    }
}
