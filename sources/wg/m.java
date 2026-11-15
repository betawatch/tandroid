package wg;

import java.util.ArrayList;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class m implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLRPC.Chat b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ z10 e;

    public /* synthetic */ m(TLRPC.Chat chat, int i7, ArrayList arrayList, z10 z10Var, int i10) {
        this.a = i10;
        this.b = chat;
        this.c = i7;
        this.d = arrayList;
        this.e = z10Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                TLRPC.Chat chat = this.b;
                ArrayList arrayList = this.d;
                if (chat == null) {
                    q.m(this.c, arrayList);
                }
                this.e.a(arrayList);
                break;
            default:
                TLRPC.Chat chat2 = this.b;
                ArrayList arrayList2 = this.d;
                if (chat2 == null) {
                    q.m(this.c, arrayList2);
                }
                this.e.a(arrayList2);
                break;
        }
    }
}
