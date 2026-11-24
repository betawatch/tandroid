// default package

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class quc {
    public int a;
    public long b;
    public long c;
    public long d;
    public String e;
    public String f;
    public int g;
    public int h;
    public long i;
    public TLRPC.BotApp j;
    public boolean k;
    public String l;
    public TLRPC.User m;
    public byte n;
    public boolean o;
    public boolean p;
    public TLObject q;
    public long r;

    /* JADX WARN: Multi-variable type inference failed */
    public static quc b(int i, long j, long j2, String str, String str2, int i2, int i3, long j3, TLRPC.BotApp botApp, boolean z, String str3, TLRPC.User user, int i4, boolean z2, boolean z3) {
        quc qucVar = new quc();
        qucVar.a = i;
        qucVar.b = j;
        qucVar.c = j2;
        qucVar.e = str;
        qucVar.f = str2;
        qucVar.g = i2;
        qucVar.h = i3;
        qucVar.i = j3;
        qucVar.j = botApp;
        qucVar.k = z;
        qucVar.l = str3;
        qucVar.m = user;
        qucVar.n = i4;
        qucVar.o = z2;
        qucVar.p = z3;
        if (!z2 && !z3 && !TextUtils.isEmpty(str2)) {
            try {
                Uri parse = Uri.parse(str2);
                qucVar.o = TextUtils.equals(parse.getQueryParameter("mode"), "compact");
                qucVar.p = TextUtils.equals(parse.getQueryParameter("mode"), "fullscreen");
                return qucVar;
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
        return qucVar;
    }

    public final void a(TLObject tLObject) {
        this.q = tLObject;
        this.r = System.currentTimeMillis();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof quc)) {
            return false;
        }
        quc qucVar = (quc) obj;
        if (this.a != qucVar.a || this.b != qucVar.b || this.c != qucVar.c || !TextUtils.equals(this.f, qucVar.f) || this.g != qucVar.g || this.h != qucVar.h) {
            return false;
        }
        TLRPC.BotApp botApp = this.j;
        long j = botApp == null ? 0L : botApp.id;
        TLRPC.BotApp botApp2 = qucVar.j;
        if (j != (botApp2 == null ? 0L : botApp2.id) || this.k != qucVar.k || !TextUtils.equals(this.l, qucVar.l)) {
            return false;
        }
        TLRPC.User user = this.m;
        long j2 = user == null ? 0L : user.id;
        TLRPC.User user2 = qucVar.m;
        return j2 == (user2 != null ? user2.id : 0L) && this.n == qucVar.n;
    }
}
