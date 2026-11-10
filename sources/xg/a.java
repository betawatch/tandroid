package xg;

import java.util.HashMap;
import org.telegram.messenger.c20;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import zh.b4;
import zh.d1;
import zh.g3;
import zh.k3;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                HashMap hashMap = ((c) this.b).x;
                hashMap.clear();
                hashMap.putAll((HashMap) obj);
                break;
            case 1:
                ((f) this.b).F((TLObject) obj);
                break;
            case 2:
                HashMap hashMap2 = ((i) this.b).r;
                hashMap2.clear();
                hashMap2.putAll((HashMap) obj);
                break;
            case 3:
                ((d1) this.b).a();
                break;
            case 4:
                k3 k3Var = (k3) this.b;
                ((Boolean) obj).getClass();
                g3 g3Var = k3Var.d;
                if (g3Var != null) {
                    g3Var.run();
                    break;
                }
                break;
            default:
                wg.h.j(((b4) this.b).getContext(), (TLRPC.TL_error) obj);
                break;
        }
    }
}
