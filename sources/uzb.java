// default package

import java.util.Iterator;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class uzb implements fd {
    public final /* synthetic */ wzb a;

    public /* synthetic */ uzb(wzb wzbVar) {
        this.a = wzbVar;
    }

    @Override // fd
    public final void w(id idVar, int i) {
        zzb zzbVar = this.a.a;
        Iterator it = zzbVar.e.iterator();
        while (it.hasNext()) {
            zzbVar.Y(((Integer) it.next()).intValue());
        }
        zzbVar.e.clear();
        zzbVar.Z();
    }
}
