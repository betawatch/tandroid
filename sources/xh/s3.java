package xh;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.f8;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class s3 {
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

    public static s3 b(int i10, long j10, long j11, String str, String str2, int i11, int i12, long j12, TLRPC.BotApp botApp, boolean z10, String str3, TLRPC.User user, int i13, boolean z11, boolean z12) {
        s3 s3Var = new s3();
        s3Var.a = i10;
        s3Var.b = j10;
        s3Var.c = j11;
        s3Var.e = str;
        s3Var.f = str2;
        s3Var.g = i11;
        s3Var.h = i12;
        s3Var.i = j12;
        s3Var.j = botApp;
        s3Var.k = z10;
        s3Var.l = str3;
        s3Var.m = user;
        s3Var.n = i13;
        s3Var.o = z11;
        s3Var.p = z12;
        if (!z11 && !z12 && !TextUtils.isEmpty(str2)) {
            try {
                Uri parse = Uri.parse(str2);
                s3Var.o = TextUtils.equals(parse.getQueryParameter("mode"), "compact");
                s3Var.p = TextUtils.equals(parse.getQueryParameter("mode"), "fullscreen");
                return s3Var;
            } catch (Exception e) {
                f8.g(e, true);
            }
        }
        return s3Var;
    }

    public final void a(TLObject tLObject) {
        this.q = tLObject;
        this.r = System.currentTimeMillis();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s3)) {
            return false;
        }
        s3 s3Var = (s3) obj;
        if (this.a != s3Var.a || this.b != s3Var.b || this.c != s3Var.c || !TextUtils.equals(this.f, s3Var.f) || this.g != s3Var.g || this.h != s3Var.h) {
            return false;
        }
        TLRPC.BotApp botApp = this.j;
        long j10 = botApp == null ? 0L : botApp.id;
        TLRPC.BotApp botApp2 = s3Var.j;
        if (j10 != (botApp2 == null ? 0L : botApp2.id) || this.k != s3Var.k || !TextUtils.equals(this.l, s3Var.l)) {
            return false;
        }
        TLRPC.User user = this.m;
        long j11 = user == null ? 0L : user.id;
        TLRPC.User user2 = s3Var.m;
        return j11 == (user2 != null ? user2.id : 0L) && this.n == s3Var.n;
    }
}
