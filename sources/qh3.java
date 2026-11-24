// default package

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class qh3 implements f59 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nk3 b;

    public /* synthetic */ qh3(nk3 nk3Var, byte b) {
        this.a = b;
        this.b = nk3Var;
    }

    @Override // f59
    public final void g(int i, View view) {
        byte b = this.a;
        nk3 nk3Var = this.b;
        switch (b) {
            case 0:
                Object obj = nk3Var.D0.y0.G(i).H;
                if (!(obj instanceof k47)) {
                    if (obj instanceof u3b) {
                        u3b u3bVar = (u3b) obj;
                        Bundle j = kt6.j(3, TeXSymbolParser.TYPE_ATTR);
                        j.putString("hashtag", u3bVar.C);
                        j.putInt("storiesCount", u3bVar.J);
                        nk3Var.presentFragment(new cm6(j, null));
                        break;
                    }
                } else {
                    k47 k47Var = (k47) obj;
                    Bundle bundle = new Bundle();
                    long B0 = k47.B0(k47Var.k);
                    TLRPC.Message message = k47Var.k;
                    if (B0 >= 0) {
                        bundle.putLong("user_id", k47.B0(message));
                    } else {
                        bundle.putLong("chat_id", -k47.B0(message));
                    }
                    bundle.putInt("message_id", k47Var.e1());
                    yv1 yv1Var = new yv1(bundle);
                    nk3.C3(yv1Var, k47Var);
                    nk3Var.presentFragment(yv1Var);
                    break;
                }
                break;
            default:
                nk3Var.c0.J0(true);
                ArrayList arrayList = nk3Var.c0.f3;
                nk3Var.B2(arrayList.isEmpty() ? uh4.k3[i] : (sh4) arrayList.get(i));
                break;
        }
    }
}
