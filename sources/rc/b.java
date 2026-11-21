package rc;

import java.util.ArrayList;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.mp0;
import org.telegram.ui.Wallet.h1;
import org.telegram.ui.Wallet.i1;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
                        h1 h1Var = (h1) obj;
                        try {
                            try {
                                u uVar2 = (u) qVar.b;
                                g0.g3(new mp0(h1Var.c, uVar2, h1Var.a, "connect error: " + i1.a(e10), 19));
                            } catch (Throwable unused) {
                            }
                        } catch (Throwable unused2) {
                            h1Var.getClass();
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
