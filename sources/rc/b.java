package rc;

import java.util.ArrayList;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.pp0;
import org.telegram.ui.Wallet.y0;
import org.telegram.ui.Wallet.z0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class b extends z {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, u uVar, int i7, int i10) {
        super(str, uVar, i7);
        this.b = i10;
    }

    @Override // rc.z
    public final void a() {
        switch (this.b) {
            case 0:
                u uVar = this.a;
                try {
                    uVar.b();
                    break;
                } catch (v e10) {
                    ab.q qVar = uVar.d;
                    qVar.d(e10);
                    ArrayList arrayList = (ArrayList) qVar.p();
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        y0 y0Var = (y0) obj;
                        try {
                            try {
                                u uVar2 = (u) qVar.b;
                                g0.h3(new pp0(y0Var.c, uVar2, y0Var.a, "connect error: " + z0.a(e10), 18));
                            } catch (Throwable unused) {
                            }
                        } catch (Throwable unused2) {
                            y0Var.getClass();
                        }
                    }
                    return;
                }
            default:
                this.a.d();
                break;
        }
    }
}
