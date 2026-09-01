package sh;

import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class n extends ee.b {
    public final /* synthetic */ p a;

    public n(p pVar) {
        this.a = pVar;
    }

    @Override // ee.b
    public final void b(int i10, CharSequence charSequence) {
        FileLog.d("BotBiometry onAuthenticationError " + i10 + " \"" + ((Object) charSequence) + "\"");
        p pVar = this.a;
        eh.w wVar = pVar.j;
        if (wVar != null) {
            pVar.j = null;
            wVar.run(Boolean.FALSE, null);
        }
    }

    @Override // ee.b
    public final void c() {
        FileLog.d("BotBiometry onAuthenticationFailed");
    }

    @Override // ee.b
    public final void d(androidx.biometric.v vVar) {
        FileLog.d("BotBiometry onAuthenticationSucceeded");
        p pVar = this.a;
        eh.w wVar = pVar.j;
        if (wVar != null) {
            pVar.j = null;
            wVar.run(Boolean.TRUE, vVar);
        }
    }
}
