package rh;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class z3 {
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

    public static z3 b(int i10, long j10, long j11, String str, String str2, int i11, int i12, long j12, TLRPC.BotApp botApp, boolean z4, String str3, TLRPC.User user, int i13, boolean z10, boolean z11) {
        z3 z3Var = new z3();
        z3Var.a = i10;
        z3Var.b = j10;
        z3Var.c = j11;
        z3Var.e = str;
        z3Var.f = str2;
        z3Var.g = i11;
        z3Var.h = i12;
        z3Var.i = j12;
        z3Var.j = botApp;
        z3Var.k = z4;
        z3Var.l = str3;
        z3Var.m = user;
        z3Var.n = i13;
        z3Var.o = z10;
        z3Var.p = z11;
        if (!z10 && !z11 && !TextUtils.isEmpty(str2)) {
            try {
                Uri parse = Uri.parse(str2);
                z3Var.o = TextUtils.equals(parse.getQueryParameter("mode"), "compact");
                z3Var.p = TextUtils.equals(parse.getQueryParameter("mode"), "fullscreen");
                return z3Var;
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        return z3Var;
    }

    public final void a(TLObject tLObject) {
        this.q = tLObject;
        this.r = System.currentTimeMillis();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z3)) {
            return false;
        }
        z3 z3Var = (z3) obj;
        if (this.a != z3Var.a || this.b != z3Var.b || this.c != z3Var.c || !TextUtils.equals(this.f, z3Var.f) || this.g != z3Var.g || this.h != z3Var.h) {
            return false;
        }
        TLRPC.BotApp botApp = this.j;
        long j10 = botApp == null ? 0L : botApp.id;
        TLRPC.BotApp botApp2 = z3Var.j;
        if (j10 != (botApp2 == null ? 0L : botApp2.id) || this.k != z3Var.k || !TextUtils.equals(this.l, z3Var.l)) {
            return false;
        }
        TLRPC.User user = this.m;
        long j11 = user == null ? 0L : user.id;
        TLRPC.User user2 = z3Var.m;
        return j11 == (user2 != null ? user2.id : 0L) && this.n == z3Var.n;
    }
}
