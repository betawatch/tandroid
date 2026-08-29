package ph;

import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class n extends h7.v {
    public final /* synthetic */ p a;

    public n(p pVar) {
        this.a = pVar;
    }

    @Override // h7.v
    public final void a(int i10, CharSequence charSequence) {
        FileLog.d("BotBiometry onAuthenticationError " + i10 + " \"" + ((Object) charSequence) + "\"");
        p pVar = this.a;
        bh.v vVar = pVar.j;
        if (vVar != null) {
            pVar.j = null;
            vVar.run(Boolean.FALSE, null);
        }
    }

    @Override // h7.v
    public final void b() {
        FileLog.d("BotBiometry onAuthenticationFailed");
    }

    @Override // h7.v
    public final void c(androidx.biometric.u uVar) {
        FileLog.d("BotBiometry onAuthenticationSucceeded");
        p pVar = this.a;
        bh.v vVar = pVar.j;
        if (vVar != null) {
            pVar.j = null;
            vVar.run(Boolean.TRUE, uVar);
        }
    }
}
