// default package

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class rwc {
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
    public static rwc b(int i, long j, long j2, String str, String str2, int i2, int i3, long j3, TLRPC.BotApp botApp, boolean z, String str3, TLRPC.User user, int i4, boolean z2, boolean z3) {
        rwc rwcVar = new rwc();
        rwcVar.a = i;
        rwcVar.b = j;
        rwcVar.c = j2;
        rwcVar.e = str;
        rwcVar.f = str2;
        rwcVar.g = i2;
        rwcVar.h = i3;
        rwcVar.i = j3;
        rwcVar.j = botApp;
        rwcVar.k = z;
        rwcVar.l = str3;
        rwcVar.m = user;
        rwcVar.n = i4;
        rwcVar.o = z2;
        rwcVar.p = z3;
        if (!z2 && !z3 && !TextUtils.isEmpty(str2)) {
            try {
                Uri parse = Uri.parse(str2);
                rwcVar.o = TextUtils.equals(parse.getQueryParameter("mode"), "compact");
                rwcVar.p = TextUtils.equals(parse.getQueryParameter("mode"), "fullscreen");
                return rwcVar;
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
        return rwcVar;
    }

    public final void a(TLObject tLObject) {
        this.q = tLObject;
        this.r = System.currentTimeMillis();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rwc)) {
            return false;
        }
        rwc rwcVar = (rwc) obj;
        if (this.a != rwcVar.a || this.b != rwcVar.b || this.c != rwcVar.c || !TextUtils.equals(this.f, rwcVar.f) || this.g != rwcVar.g || this.h != rwcVar.h) {
            return false;
        }
        TLRPC.BotApp botApp = this.j;
        long j = botApp == null ? 0L : botApp.id;
        TLRPC.BotApp botApp2 = rwcVar.j;
        if (j != (botApp2 == null ? 0L : botApp2.id) || this.k != rwcVar.k || !TextUtils.equals(this.l, rwcVar.l)) {
            return false;
        }
        TLRPC.User user = this.m;
        long j2 = user == null ? 0L : user.id;
        TLRPC.User user2 = rwcVar.m;
        return j2 == (user2 != null ? user2.id : 0L) && this.n == rwcVar.n;
    }
}
