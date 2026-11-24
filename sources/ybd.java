// default package

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class ybd implements f69 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ afd b;
    public final /* synthetic */ String c;
    public final /* synthetic */ i69 d;

    public /* synthetic */ ybd(afd afdVar, i69 i69Var, String str) {
        this.b = afdVar;
        this.d = i69Var;
        this.c = str;
    }

    @Override // f69
    public final void accept(Object obj, Object obj2) {
        byte b = this.a;
        i69 i69Var = this.d;
        String str = this.c;
        afd afdVar = this.b;
        lhf lhfVar = (lhf) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        switch (b) {
            case 0:
                fre.j("Not active connection", afdVar.G != 1);
                if (i69Var != null) {
                    x6d x6dVar = (x6d) lhfVar.k();
                    Parcel R = x6dVar.R();
                    R.writeString(str);
                    x6dVar.W(R, 12);
                }
                taskCompletionSource.setResult(null);
                break;
            default:
                fre.j("Not active connection", afdVar.G != 1);
                x6d x6dVar2 = (x6d) lhfVar.k();
                Parcel R2 = x6dVar2.R();
                R2.writeString(str);
                x6dVar2.W(R2, 12);
                if (i69Var != null) {
                    x6d x6dVar3 = (x6d) lhfVar.k();
                    Parcel R3 = x6dVar3.R();
                    R3.writeString(str);
                    x6dVar3.W(R3, 11);
                }
                taskCompletionSource.setResult(null);
                break;
        }
    }

    public /* synthetic */ ybd(afd afdVar, String str, i69 i69Var) {
        this.b = afdVar;
        this.c = str;
        this.d = i69Var;
    }
}
