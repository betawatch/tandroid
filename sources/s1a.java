// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class s1a implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ z3a b;
    public final /* synthetic */ TLRPC.Message c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ s1a(z3a z3aVar, TLRPC.Message message, boolean z, byte b) {
        this.a = b;
        this.b = z3aVar;
        this.c = message;
        this.d = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        boolean z = this.d;
        TLRPC.Message message = this.c;
        z3a z3aVar = this.b;
        switch (b) {
            case 0:
                z3aVar.c0(message.id);
                z3aVar.h0(message.id, z);
                break;
            case 1:
                z3aVar.c0(message.id);
                z3aVar.h0(message.id, z);
                break;
            default:
                z3aVar.f0(message, z);
                break;
        }
    }
}
