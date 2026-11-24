// default package

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class vs0 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ct0 b;

    public /* synthetic */ vs0(ct0 ct0Var, byte b) {
        this.a = b;
        this.b = ct0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        final ct0 ct0Var = this.b;
        switch (b) {
            case 0:
                final byte b2 = 1;
                gl.c3(new Runnable() { // from class: us0
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b3 = b2;
                        TLObject tLObject2 = tLObject;
                        ct0 ct0Var2 = ct0Var;
                        switch (b3) {
                            case 0:
                                ct0Var2.j = new ArrayList();
                                ct0Var2.i = false;
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    for (int i = 0; i < vector.objects.size(); i++) {
                                        ct0Var2.j.add((TLRPC.User) vector.objects.get(i));
                                    }
                                    na7.q1(ct0Var2.a).b4(ct0Var2.j, false);
                                    break;
                                }
                                break;
                            default:
                                int i2 = ct0Var2.a;
                                ct0Var2.l = new ArrayList();
                                ct0Var2.k = false;
                                if (tLObject2 instanceof TLRPC.messages_Chats) {
                                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject2;
                                    na7.q1(i2).V3(messages_chats.chats, false);
                                    ct0Var2.l.addAll(messages_chats.chats);
                                }
                                kk7.f(i2).k(kk7.O3, new Object[0]);
                                break;
                        }
                    }
                });
                break;
            default:
                final byte b3 = 0;
                gl.c3(new Runnable() { // from class: us0
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b32 = b3;
                        TLObject tLObject2 = tLObject;
                        ct0 ct0Var2 = ct0Var;
                        switch (b32) {
                            case 0:
                                ct0Var2.j = new ArrayList();
                                ct0Var2.i = false;
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    for (int i = 0; i < vector.objects.size(); i++) {
                                        ct0Var2.j.add((TLRPC.User) vector.objects.get(i));
                                    }
                                    na7.q1(ct0Var2.a).b4(ct0Var2.j, false);
                                    break;
                                }
                                break;
                            default:
                                int i2 = ct0Var2.a;
                                ct0Var2.l = new ArrayList();
                                ct0Var2.k = false;
                                if (tLObject2 instanceof TLRPC.messages_Chats) {
                                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject2;
                                    na7.q1(i2).V3(messages_chats.chats, false);
                                    ct0Var2.l.addAll(messages_chats.chats);
                                }
                                kk7.f(i2).k(kk7.O3, new Object[0]);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
