package q5;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class z implements com.google.android.gms.common.api.internal.s {
    public static final /* synthetic */ z b = new z(0);
    public static final /* synthetic */ z c = new z(1);
    public final /* synthetic */ int a;

    public /* synthetic */ z(int i10) {
        this.a = i10;
    }

    @Override // com.google.android.gms.common.api.internal.s
    public final void accept(Object obj, Object obj2) {
        u5.x xVar = (u5.x) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        switch (this.a) {
            case 0:
                u5.b bVar = f0.G;
                ((u5.f) xVar.u()).U0();
                taskCompletionSource.setResult(null);
                break;
            default:
                u5.b bVar2 = f0.G;
                u5.f fVar = (u5.f) xVar.u();
                fVar.R0(fVar.M0(), 19);
                taskCompletionSource.setResult(Boolean.TRUE);
                break;
        }
    }
}
