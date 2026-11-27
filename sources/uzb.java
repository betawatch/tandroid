// default package

import java.util.Iterator;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
