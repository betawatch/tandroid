package xh;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.f8;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class t3 {
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

    public static t3 b(int i10, long j10, long j11, String str, String str2, int i11, int i12, long j12, TLRPC.BotApp botApp, boolean z10, String str3, TLRPC.User user, int i13, boolean z11, boolean z12) {
        t3 t3Var = new t3();
        t3Var.a = i10;
        t3Var.b = j10;
        t3Var.c = j11;
        t3Var.e = str;
        t3Var.f = str2;
        t3Var.g = i11;
        t3Var.h = i12;
        t3Var.i = j12;
        t3Var.j = botApp;
        t3Var.k = z10;
        t3Var.l = str3;
        t3Var.m = user;
        t3Var.n = i13;
        t3Var.o = z11;
        t3Var.p = z12;
        if (!z11 && !z12 && !TextUtils.isEmpty(str2)) {
            try {
                Uri parse = Uri.parse(str2);
                t3Var.o = TextUtils.equals(parse.getQueryParameter("mode"), "compact");
                t3Var.p = TextUtils.equals(parse.getQueryParameter("mode"), "fullscreen");
                return t3Var;
            } catch (Exception e) {
                f8.g(e, true);
            }
        }
        return t3Var;
    }

    public final void a(TLObject tLObject) {
        this.q = tLObject;
        this.r = System.currentTimeMillis();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t3)) {
            return false;
        }
        t3 t3Var = (t3) obj;
        if (this.a != t3Var.a || this.b != t3Var.b || this.c != t3Var.c || !TextUtils.equals(this.f, t3Var.f) || this.g != t3Var.g || this.h != t3Var.h) {
            return false;
        }
        TLRPC.BotApp botApp = this.j;
        long j10 = botApp == null ? 0L : botApp.id;
        TLRPC.BotApp botApp2 = t3Var.j;
        if (j10 != (botApp2 == null ? 0L : botApp2.id) || this.k != t3Var.k || !TextUtils.equals(this.l, t3Var.l)) {
            return false;
        }
        TLRPC.User user = this.m;
        long j11 = user == null ? 0L : user.id;
        TLRPC.User user2 = t3Var.m;
        return j11 == (user2 != null ? user2.id : 0L) && this.n == t3Var.n;
    }
}
