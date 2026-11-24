// default package

import org.telegram.tgnet.RequestTimeDelegate;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class utc implements RequestTimeDelegate {
    public final /* synthetic */ wtc a;
    public final /* synthetic */ vtc b;

    public /* synthetic */ utc(wtc wtcVar, vtc vtcVar) {
        this.a = wtcVar;
        this.b = vtcVar;
    }

    @Override // org.telegram.tgnet.RequestTimeDelegate
    public final void run(long j) {
        gl.c3(new d2b((Object) this.a, (Object) this.b, j, (byte) 14));
    }
}
