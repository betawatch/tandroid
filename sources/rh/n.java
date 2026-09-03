package rh;

import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class n extends com.google.android.gms.internal.play_billing.s1 {
    public final /* synthetic */ p a;

    public n(p pVar) {
        this.a = pVar;
    }

    @Override // com.google.android.gms.internal.play_billing.s1
    public final void a(int i10, CharSequence charSequence) {
        FileLog.d("BotBiometry onAuthenticationError " + i10 + " \"" + ((Object) charSequence) + "\"");
        p pVar = this.a;
        dh.v vVar = pVar.j;
        if (vVar != null) {
            pVar.j = null;
            vVar.run(Boolean.FALSE, null);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.s1
    public final void b() {
        FileLog.d("BotBiometry onAuthenticationFailed");
    }

    @Override // com.google.android.gms.internal.play_billing.s1
    public final void c(androidx.biometric.u uVar) {
        FileLog.d("BotBiometry onAuthenticationSucceeded");
        p pVar = this.a;
        dh.v vVar = pVar.j;
        if (vVar != null) {
            pVar.j = null;
            vVar.run(Boolean.TRUE, uVar);
        }
    }
}
