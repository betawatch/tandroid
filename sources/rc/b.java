package rc;

import java.util.ArrayList;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.pp0;
import org.telegram.ui.Wallet.x0;
import org.telegram.ui.Wallet.y0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
                        x0 x0Var = (x0) obj;
                        try {
                            try {
                                u uVar2 = (u) qVar.b;
                                g0.h3(new pp0(x0Var.c, uVar2, x0Var.a, "connect error: " + y0.a(e10), 18));
                            } catch (Throwable unused) {
                            }
                        } catch (Throwable unused2) {
                            x0Var.getClass();
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
