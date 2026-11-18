package wg;

import java.util.ArrayList;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class m implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLRPC.Chat b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ x10 e;

    public /* synthetic */ m(TLRPC.Chat chat, int i7, ArrayList arrayList, x10 x10Var, int i10) {
        this.a = i10;
        this.b = chat;
        this.c = i7;
        this.d = arrayList;
        this.e = x10Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                TLRPC.Chat chat = this.b;
                ArrayList arrayList = this.d;
                if (chat == null) {
                    s.m(this.c, arrayList);
                }
                this.e.a(arrayList);
                break;
            default:
                TLRPC.Chat chat2 = this.b;
                ArrayList arrayList2 = this.d;
                if (chat2 == null) {
                    s.m(this.c, arrayList2);
                }
                this.e.a(arrayList2);
                break;
        }
    }
}
