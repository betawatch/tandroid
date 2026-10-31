package rh;

import java.util.ArrayList;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class l implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ r b;

    public /* synthetic */ l(r rVar, int i10) {
        this.a = i10;
        this.b = rVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 1;
                final r rVar = this.b;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: rh.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                r rVar2 = rVar;
                                rVar2.getClass();
                                rVar2.j = new ArrayList();
                                rVar2.i = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    for (int i11 = 0; i11 < vector.objects.size(); i11++) {
                                        rVar2.j.add((TLRPC.User) vector.objects.get(i11));
                                    }
                                    vp.r1(rVar2.a).V3(rVar2.j, false);
                                    break;
                                }
                                break;
                            default:
                                r rVar3 = rVar;
                                int i12 = rVar3.a;
                                rVar3.l = new ArrayList();
                                rVar3.k = false;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.messages_Chats) {
                                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject3;
                                    vp.r1(i12).P3(messages_chats.chats, false);
                                    rVar3.l.addAll(messages_chats.chats);
                                }
                                zs.f(i12).k(zs.M3, new Object[0]);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 0;
                final r rVar2 = this.b;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: rh.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                r rVar22 = rVar2;
                                rVar22.getClass();
                                rVar22.j = new ArrayList();
                                rVar22.i = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    for (int i112 = 0; i112 < vector.objects.size(); i112++) {
                                        rVar22.j.add((TLRPC.User) vector.objects.get(i112));
                                    }
                                    vp.r1(rVar22.a).V3(rVar22.j, false);
                                    break;
                                }
                                break;
                            default:
                                r rVar3 = rVar2;
                                int i12 = rVar3.a;
                                rVar3.l = new ArrayList();
                                rVar3.k = false;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.messages_Chats) {
                                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject3;
                                    vp.r1(i12).P3(messages_chats.chats, false);
                                    rVar3.l.addAll(messages_chats.chats);
                                }
                                zs.f(i12).k(zs.M3, new Object[0]);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
