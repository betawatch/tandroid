// default package

import java.util.List;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class x1a implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ z3a b;
    public final /* synthetic */ String c;
    public final /* synthetic */ List d;

    public /* synthetic */ x1a(z3a z3aVar, String str, List list, byte b) {
        this.a = b;
        this.b = z3aVar;
        this.c = str;
        this.d = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        List list = this.d;
        String str = this.c;
        z3a z3aVar = this.b;
        switch (b) {
            case 0:
                z3aVar.r.remove(str);
                list.remove(str);
                break;
            default:
                z3aVar.r.remove(str);
                list.remove(str);
                break;
        }
    }
}
