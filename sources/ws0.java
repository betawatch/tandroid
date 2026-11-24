// default package

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class ws0 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ws0(hd hdVar, long j, j5 j5Var, sc7 sc7Var) {
        this.a = (byte) 2;
        this.d = hdVar;
        this.b = j;
        this.c = j5Var;
        this.e = sc7Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                gl.c3(new o77((ct0) obj3, (hd) obj2, tLObject, this.b, (p8c) obj));
                break;
            case 1:
                gl.c3(new fl1(obj3, (Object) tLObject, obj2, (TLObject) tL_error, obj, this.b, (byte) 2));
                break;
            case 2:
                gl.c3(new o77(obj2, (Object) tLObject, this.b, obj3, obj, (byte) 8));
                break;
            case 3:
                gl.c3(new o77(obj3, (Object) tLObject, this.b, obj2, obj, (byte) 10));
                break;
            case 4:
                na7 na7Var = (na7) obj3;
                int[] iArr = (int[]) obj2;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
                    int i = tL_messages_affectedHistory.offset;
                    long j = this.b;
                    if (i > 0) {
                        na7Var.e0(j, iArr[0], inputPeer);
                    }
                    na7Var.P3(tL_messages_affectedHistory.pts, -1, tL_messages_affectedHistory.pts_count);
                    ad7 messagesStorage = na7Var.getMessagesStorage();
                    messagesStorage.a.c(new ua7(messagesStorage, j, (byte) 5));
                    break;
                }
                break;
            case 5:
                gl.c3(new fl1(obj3, (Object) tLObject, obj2, (TLObject) obj, (Object) tL_error, this.b, (byte) 3));
                break;
            case 6:
                gl.c3(new o77(obj3, (Object) tLObject, obj2, this.b, obj, (byte) 16));
                break;
            default:
                pub pubVar = (pub) obj3;
                d dVar = (d) obj2;
                ArrayList arrayList = (ArrayList) obj;
                pubVar.getClass();
                if (tL_error != null) {
                    boolean equals = "PINNED_TOO_MUCH".equals(tL_error.text);
                    long j2 = this.b;
                    if (!equals) {
                        if ("PINNED_TOPIC_NOT_MODIFIED".equals(tL_error.text)) {
                            gl.c3(new ko2((Object) pubVar, j2, false, (byte) 4));
                            break;
                        }
                    } else if (dVar != null) {
                        pubVar.a(j2, arrayList, true);
                        gl.c3(new ee2(pubVar, dVar, (byte) 14));
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ ws0(na7 na7Var, long j, Object obj, TLObject tLObject, byte b) {
        this.a = b;
        this.c = na7Var;
        this.b = j;
        this.d = obj;
        this.e = tLObject;
    }

    public /* synthetic */ ws0(Object obj, Object obj2, long j, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = j;
        this.e = obj3;
    }

    public /* synthetic */ ws0(Object obj, Object obj2, Object obj3, long j, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = j;
    }
}
