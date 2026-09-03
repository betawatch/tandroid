package tf;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class e0 {
    public final int a;
    public final int b;
    public final String c;
    public final int d;
    public final TLRPC.MessagesFilter e;
    public TLObject f;
    public c0 g;
    public boolean h;

    public e0(int i10, int i11, String str) {
        this.h = true;
        this.a = i10;
        this.c = str;
        this.e = null;
        this.d = i11;
    }

    public final boolean a() {
        int i10 = this.d;
        return i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3 || i10 == 5;
    }

    public final boolean b(e0 e0Var) {
        if (this.d == e0Var.d) {
            return true;
        }
        return a() && e0Var.a();
    }

    public e0(int i10, int i11, TLRPC.MessagesFilter messagesFilter, int i12) {
        this.h = true;
        this.a = i10;
        this.b = i11;
        this.e = messagesFilter;
        this.d = i12;
    }
}
