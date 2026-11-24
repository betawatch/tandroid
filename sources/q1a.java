// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class q1a implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ z3a b;
    public final /* synthetic */ long c;
    public final /* synthetic */ ArrayList d;

    public /* synthetic */ q1a(z3a z3aVar, long j, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = z3aVar;
        this.c = j;
        this.d = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ArrayList arrayList = this.d;
        long j = this.c;
        z3a z3aVar = this.b;
        switch (b) {
            case 0:
                z3aVar.getMessagesController().n3(arrayList, j);
                break;
            case 1:
                z3aVar.getMessagesController().n3(arrayList, j);
                break;
            default:
                z3aVar.getMessagesController().n3(arrayList, j);
                break;
        }
    }
}
