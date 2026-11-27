// default package

import android.view.ViewGroup;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class zga extends zo {
    public final /* synthetic */ byte c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ ViewGroup e;

    public /* synthetic */ zga(ViewGroup viewGroup, Object obj, byte b) {
        this.c = b;
        this.e = viewGroup;
        this.d = obj;
    }

    @Override // zo
    public final int i(int i) {
        int i2;
        int i3;
        byte b = this.c;
        ViewGroup viewGroup = this.e;
        Object obj = this.d;
        switch (b) {
            case 0:
                zha zhaVar = (zha) obj;
                j79 adapter = zhaVar.n.getAdapter();
                eja ejaVar = (eja) viewGroup;
                yia yiaVar = ejaVar.L;
                if (adapter == yiaVar) {
                    if (yiaVar.d(i) == 2) {
                        return zhaVar.r.J;
                    }
                    return 1;
                }
                if (ejaVar.y1(adapter) == -1) {
                    return 1;
                }
                ((bja) adapter).getClass();
                return 1;
            case 1:
                o9c o9cVar = (o9c) obj;
                l9c l9cVar = ((q9c) viewGroup).g3;
                if (l9cVar == null) {
                    return o9cVar.J;
                }
                b8c G = l9cVar.G(i);
                return (G == null || (i2 = G.v) == -1) ? o9cVar.J : i2;
            default:
                o9c o9cVar2 = (o9c) obj;
                l9c l9cVar2 = ((q9c) viewGroup).g3;
                if (l9cVar2 == null) {
                    return o9cVar2.J;
                }
                b8c G2 = l9cVar2.G(i);
                return (G2 == null || (i3 = G2.v) == -1) ? o9cVar2.J : i3;
        }
    }
}
