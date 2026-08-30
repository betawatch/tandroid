package q5;

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements com.google.android.gms.common.api.internal.s {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ e0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ f d;

    public /* synthetic */ a0(e0 e0Var, String str, s5.h hVar) {
        this.b = e0Var;
        this.c = str;
        this.d = hVar;
    }

    @Override // com.google.android.gms.common.api.internal.s
    public final void accept(Object obj, Object obj2) {
        u5.x xVar = (u5.x) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        switch (this.a) {
            case 0:
                b6.m.j("Not active connection", this.b.F != 1);
                if (this.d != null) {
                    u5.f fVar = (u5.f) xVar.u();
                    Parcel M0 = fVar.M0();
                    M0.writeString(this.c);
                    fVar.R0(M0, 12);
                }
                taskCompletionSource.setResult(null);
                break;
            default:
                b6.m.j("Not active connection", this.b.F != 1);
                u5.f fVar2 = (u5.f) xVar.u();
                Parcel M02 = fVar2.M0();
                String str = this.c;
                M02.writeString(str);
                fVar2.R0(M02, 12);
                if (this.d != null) {
                    u5.f fVar3 = (u5.f) xVar.u();
                    Parcel M03 = fVar3.M0();
                    M03.writeString(str);
                    fVar3.R0(M03, 11);
                }
                taskCompletionSource.setResult(null);
                break;
        }
    }

    public /* synthetic */ a0(e0 e0Var, f fVar, String str) {
        this.b = e0Var;
        this.d = fVar;
        this.c = str;
    }
}
