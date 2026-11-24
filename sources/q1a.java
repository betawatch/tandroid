// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
                z3aVar.getMessagesController().m3(arrayList, j);
                break;
            case 1:
                z3aVar.getMessagesController().m3(arrayList, j);
                break;
            default:
                z3aVar.getMessagesController().m3(arrayList, j);
                break;
        }
    }
}
