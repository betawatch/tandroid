// default package

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class yg3 implements r69 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uj3 b;

    public /* synthetic */ yg3(uj3 uj3Var, byte b) {
        this.a = b;
        this.b = uj3Var;
    }

    @Override // r69
    public final void e(int i, View view) {
        byte b = this.a;
        uj3 uj3Var = this.b;
        switch (b) {
            case 0:
                Object obj = uj3Var.D0.y0.G(i).H;
                if (!(obj instanceof r47)) {
                    if (obj instanceof q5b) {
                        q5b q5bVar = (q5b) obj;
                        Bundle j = qu6.j(3, TeXSymbolParser.TYPE_ATTR);
                        j.putString("hashtag", q5bVar.C);
                        j.putInt("storiesCount", q5bVar.J);
                        uj3Var.presentFragment(new em6(j, null));
                        break;
                    }
                } else {
                    r47 r47Var = (r47) obj;
                    Bundle bundle = new Bundle();
                    long B0 = r47.B0(r47Var.k);
                    TLRPC.Message message = r47Var.k;
                    if (B0 >= 0) {
                        bundle.putLong("user_id", r47.B0(message));
                    } else {
                        bundle.putLong("chat_id", -r47.B0(message));
                    }
                    bundle.putInt("message_id", r47Var.e1());
                    zu1 zu1Var = new zu1(bundle);
                    uj3.C3(zu1Var, r47Var);
                    uj3Var.presentFragment(zu1Var);
                    break;
                }
                break;
            default:
                uj3Var.c0.K0(true);
                ArrayList arrayList = uj3Var.c0.f3;
                uj3Var.B2(arrayList.isEmpty() ? rh4.k3[i] : (ph4) arrayList.get(i));
                break;
        }
    }
}
