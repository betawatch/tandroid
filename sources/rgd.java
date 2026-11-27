// default package

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class rgd implements s99 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ rjd b;
    public final /* synthetic */ String c;
    public final /* synthetic */ v99 d;

    public /* synthetic */ rgd(rjd rjdVar, v99 v99Var, String str) {
        this.b = rjdVar;
        this.d = v99Var;
        this.c = str;
    }

    @Override // s99
    public final void accept(Object obj, Object obj2) {
        byte b = this.a;
        v99 v99Var = this.d;
        String str = this.c;
        rjd rjdVar = this.b;
        bmf bmfVar = (bmf) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        switch (b) {
            case 0:
                xve.j("Not active connection", rjdVar.G != 1);
                if (v99Var != null) {
                    qbd qbdVar = (qbd) bmfVar.k();
                    Parcel R = qbdVar.R();
                    R.writeString(str);
                    qbdVar.W(R, 12);
                }
                taskCompletionSource.setResult(null);
                break;
            default:
                xve.j("Not active connection", rjdVar.G != 1);
                qbd qbdVar2 = (qbd) bmfVar.k();
                Parcel R2 = qbdVar2.R();
                R2.writeString(str);
                qbdVar2.W(R2, 12);
                if (v99Var != null) {
                    qbd qbdVar3 = (qbd) bmfVar.k();
                    Parcel R3 = qbdVar3.R();
                    R3.writeString(str);
                    qbdVar3.W(R3, 11);
                }
                taskCompletionSource.setResult(null);
                break;
        }
    }

    public /* synthetic */ rgd(rjd rjdVar, String str, v99 v99Var) {
        this.b = rjdVar;
        this.c = str;
        this.d = v99Var;
    }
}
