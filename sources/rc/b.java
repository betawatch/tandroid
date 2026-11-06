package rc;

import java.util.ArrayList;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.pp0;
import org.telegram.ui.Wallet.a1;
import org.telegram.ui.Wallet.z0;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
                        z0 z0Var = (z0) obj;
                        try {
                            try {
                                u uVar2 = (u) qVar.b;
                                g0.h3(new pp0(z0Var.c, uVar2, z0Var.a, "connect error: " + a1.a(e10), 18));
                            } catch (Throwable unused) {
                            }
                        } catch (Throwable unused2) {
                            z0Var.getClass();
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
