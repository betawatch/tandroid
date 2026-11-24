// default package

import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class qqc implements qac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vqc b;

    public /* synthetic */ qqc(vqc vqcVar, byte b) {
        this.a = b;
        this.b = vqcVar;
    }

    @Override // qac
    public final void a(Object obj) {
        byte b = this.a;
        vqc vqcVar = this.b;
        switch (b) {
            case 0:
                vqcVar.h0((qac) obj);
                break;
            case 1:
                String str = (String) obj;
                if (str == null) {
                    u31 I = c41.b0(vqcVar).I(R.raw.contact_check, jb6.M0(2131742871, null), jb6.M0(2131742869, null));
                    I.j = 5000;
                    I.j();
                    vqcVar.a.g3.O(true);
                    break;
                } else {
                    c41.b0(vqcVar).f0(str, false);
                    break;
                }
            default:
                vqcVar.e0((Boolean) obj);
                break;
        }
    }
}
