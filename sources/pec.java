// default package

import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class pec implements d39, e39 {
    public final /* synthetic */ vec a;

    public /* synthetic */ pec(vec vecVar) {
        this.a = vecVar;
    }

    @Override // e39
    public final boolean d(int i, View view) {
        j8c j8cVar = this.a.b;
        if (j8cVar == null) {
            return false;
        }
        return ((Boolean) j8cVar.g(Integer.valueOf(((tec) view).a.a), view)).booleanValue();
    }

    @Override // d39
    public final void e(float f, float f2, int i, View view) {
        vec vecVar = this.a;
        uec uecVar = vecVar.E;
        if (uecVar == null || uecVar.b()) {
            tec tecVar = (tec) view;
            if (i != vecVar.G || vecVar.E == null) {
                j8c j8cVar = vecVar.m0;
                if (j8cVar == null || !((Boolean) j8cVar.g(Integer.valueOf(tecVar.a.a), Integer.valueOf(i))).booleanValue()) {
                    vecVar.e(tecVar.a.a, i);
                }
            }
        }
    }

    @Override // d39
    public final boolean q(View view) {
        return false;
    }

    @Override // d39
    public final void l(View view, float f, float f2) {
    }
}
