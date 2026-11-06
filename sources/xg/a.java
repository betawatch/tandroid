package xg;

import java.util.HashMap;
import org.telegram.messenger.c20;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import zh.b4;
import zh.e1;
import zh.h3;
import zh.k3;
import zh.m3;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
                ((e1) this.b).a();
                break;
            case 4:
                ((m3) this.b).j0(((Boolean) obj).booleanValue());
                break;
            case 5:
                k3 k3Var = (k3) this.b;
                ((Boolean) obj).getClass();
                h3 h3Var = k3Var.d;
                if (h3Var != null) {
                    h3Var.run();
                    break;
                }
                break;
            default:
                wg.h.j(((b4) this.b).getContext(), (TLRPC.TL_error) obj);
                break;
        }
    }
}
