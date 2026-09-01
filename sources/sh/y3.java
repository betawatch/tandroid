package sh;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class y3 {
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
    public int n;
    public boolean o;
    public boolean p;
    public TLObject q;
    public long r;

    public static y3 b(int i10, long j10, long j11, String str, String str2, int i11, int i12, long j12, TLRPC.BotApp botApp, boolean z4, String str3, TLRPC.User user, int i13, boolean z10, boolean z11) {
        y3 y3Var = new y3();
        y3Var.a = i10;
        y3Var.b = j10;
        y3Var.c = j11;
        y3Var.e = str;
        y3Var.f = str2;
        y3Var.g = i11;
        y3Var.h = i12;
        y3Var.i = j12;
        y3Var.j = botApp;
        y3Var.k = z4;
        y3Var.l = str3;
        y3Var.m = user;
        y3Var.n = i13;
        y3Var.o = z10;
        y3Var.p = z11;
        if (!z10 && !z11 && !TextUtils.isEmpty(str2)) {
            try {
                Uri parse = Uri.parse(str2);
                y3Var.o = TextUtils.equals(parse.getQueryParameter("mode"), "compact");
                y3Var.p = TextUtils.equals(parse.getQueryParameter("mode"), "fullscreen");
                return y3Var;
            } catch (Exception e6) {
                FileLog.e(e6);
            }
        }
        return y3Var;
    }

    public final void a(TLObject tLObject) {
        this.q = tLObject;
        this.r = System.currentTimeMillis();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y3)) {
            return false;
        }
        y3 y3Var = (y3) obj;
        if (this.a != y3Var.a || this.b != y3Var.b || this.c != y3Var.c || !TextUtils.equals(this.f, y3Var.f) || this.g != y3Var.g || this.h != y3Var.h) {
            return false;
        }
        TLRPC.BotApp botApp = this.j;
        long j10 = botApp == null ? 0L : botApp.id;
        TLRPC.BotApp botApp2 = y3Var.j;
        if (j10 != (botApp2 == null ? 0L : botApp2.id) || this.k != y3Var.k || !TextUtils.equals(this.l, y3Var.l)) {
            return false;
        }
        TLRPC.User user = this.m;
        long j11 = user == null ? 0L : user.id;
        TLRPC.User user2 = y3Var.m;
        return j11 == (user2 != null ? user2.id : 0L) && this.n == y3Var.n;
    }
}
