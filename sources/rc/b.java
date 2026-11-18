package rc;

import java.util.ArrayList;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.kp0;
import org.telegram.ui.Wallet.h1;
import org.telegram.ui.Wallet.i1;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
                                g0.g3(new kp0(h1Var.c, uVar2, h1Var.a, "connect error: " + i1.a(e10), 19));
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
