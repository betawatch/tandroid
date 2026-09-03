package r3;

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class x implements com.google.android.gms.common.api.internal.s {
    public final String[] a;

    public /* synthetic */ x(u5.s sVar, String[] strArr) {
        this.a = strArr;
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        u5.r rVar = new u5.r(0, (TaskCompletionSource) obj2);
        u5.i iVar = (u5.i) ((u5.t) obj).u();
        Parcel M0 = iVar.M0();
        com.google.android.gms.internal.cast.s.d(M0, rVar);
        M0.writeStringArray(this.a);
        iVar.R0(M0, 5);
    }

    public x(String[] strArr) {
        this.a = strArr;
    }
}
