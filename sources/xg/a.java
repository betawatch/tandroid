package xg;

import java.util.HashMap;
import org.telegram.messenger.c20;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import zh.a4;
import zh.d1;
import zh.f3;
import zh.j3;
import zh.l3;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
                ((l3) this.b).j0(((Boolean) obj).booleanValue());
                break;
            case 5:
                j3 j3Var = (j3) this.b;
                ((Boolean) obj).getClass();
                f3 f3Var = j3Var.d;
                if (f3Var != null) {
                    f3Var.run();
                    break;
                }
                break;
            default:
                wg.h.j(((a4) this.b).getContext(), (TLRPC.TL_error) obj);
                break;
        }
    }
}
