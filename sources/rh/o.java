package rh;

import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class o extends com.google.android.gms.internal.play_billing.s1 {
    public final /* synthetic */ q a;

    public o(q qVar) {
        this.a = qVar;
    }

    @Override // com.google.android.gms.internal.play_billing.s1
    public final void a(int i10, CharSequence charSequence) {
        FileLog.d("BotBiometry onAuthenticationError " + i10 + " \"" + ((Object) charSequence) + "\"");
        q qVar = this.a;
        dh.v vVar = qVar.j;
        if (vVar != null) {
            qVar.j = null;
            vVar.run(Boolean.FALSE, null);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.s1
    public final void b() {
        FileLog.d("BotBiometry onAuthenticationFailed");
    }

    @Override // com.google.android.gms.internal.play_billing.s1
    public final void c(androidx.biometric.v vVar) {
        FileLog.d("BotBiometry onAuthenticationSucceeded");
        q qVar = this.a;
        dh.v vVar2 = qVar.j;
        if (vVar2 != null) {
            qVar.j = null;
            vVar2.run(Boolean.TRUE, vVar);
        }
    }
}
