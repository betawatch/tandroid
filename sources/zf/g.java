package zf;

import android.os.Parcel;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.telegram.ui.Components.jo0;
import org.telegram.ui.Components.m6;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class g implements jo0, s {
    public final /* synthetic */ Object a;

    public /* synthetic */ g(Object obj) {
        this.a = obj;
    }

    @Override // org.telegram.ui.Components.jo0
    public void Y(float f10, boolean z4) {
        h hVar = (h) this.a;
        float f11 = hVar.b;
        float w10 = e2.c.w(hVar.c, f11, f10, f11);
        hVar.d = w10;
        if (z4) {
            m6 m6Var = hVar.e;
            m6Var.getClass();
            m6Var.b(null, w10);
        }
        hVar.invalidate();
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        z7.c cVar = (z7.c) this.a;
        o7.d dVar = new o7.d(1, (TaskCompletionSource) obj2);
        o7.c cVar2 = (o7.c) ((o7.f) obj).u();
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
        int i10 = o7.a.a;
        obtain.writeStrongBinder(dVar);
        obtain.writeInt(1);
        cVar.writeToParcel(obtain, 0);
        cVar2.E0(obtain, 1);
    }

    @Override // org.telegram.ui.Components.jo0
    public CharSequence getContentDescription() {
        h hVar = (h) this.a;
        float f10 = hVar.b;
        return String.valueOf(Math.round((hVar.a.getProgress() * (hVar.c - f10)) + f10));
    }

    @Override // org.telegram.ui.Components.jo0
    public /* synthetic */ int j0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.jo0
    public void B() {
    }
}
