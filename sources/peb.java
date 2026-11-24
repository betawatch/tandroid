// default package

import org.telegram.messenger.a;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class peb implements hp7, jp7 {
    public final /* synthetic */ reb a;

    @Override // hp7
    public final String c(int i) {
        return this.a.n[i];
    }

    @Override // jp7
    public final void g(lp7 lp7Var, int i) {
        reb rebVar = this.a;
        rebVar.b();
        gda.n1 = i;
        a.b.getSharedPreferences("mainconfig", 0).edit().putInt("ChatSwipeAction", gda.n1).apply();
        rebVar.invalidate();
        try {
            lp7Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
