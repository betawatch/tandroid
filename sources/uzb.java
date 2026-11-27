// default package

import java.util.Iterator;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
