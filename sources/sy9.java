// default package

import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class sy9 extends ja {
    public TLRPC.User c;
    public TLRPC.InputPeer d;
    public TLRPC.TL_help_country e;
    public String f;
    public String g;
    public byte h;
    public int i;
    public boolean j;
    public int k;
    public vzb l;
    public vzb m;
    public o7c n;
    public o7c o;
    public View p;

    public sy9(int i, boolean z) {
        super(i, z);
        this.k = -1;
    }

    public static sy9 b(String str) {
        sy9 sy9Var = new sy9(8, false);
        sy9Var.f = str;
        return sy9Var;
    }

    public static sy9 c(TLRPC.User user, boolean z) {
        sy9 sy9Var = new sy9(3, true);
        sy9Var.c = user;
        sy9Var.d = null;
        sy9Var.j = z;
        return sy9Var;
    }

    @Override // ja
    public final boolean a(ja jaVar) {
        if (this != jaVar) {
            if (sy9.class == jaVar.getClass()) {
                sy9 sy9Var = (sy9) jaVar;
                if (this.j == sy9Var.j) {
                    if (this.a == 8) {
                        if (TextUtils.equals(this.g, sy9Var.g)) {
                            if ((this.l == null) != (sy9Var.l == null)) {
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        long m;
        if (this == obj) {
            return true;
        }
        if (obj == null || sy9.class != obj.getClass()) {
            return false;
        }
        sy9 sy9Var = (sy9) obj;
        int i = this.a;
        if (i != sy9Var.a) {
            return false;
        }
        if (i == -1 && this.k != sy9Var.k) {
            return false;
        }
        if (i == 3) {
            TLRPC.User user = this.c;
            long j = 0;
            if (user != null) {
                m = user.id;
            } else {
                TLRPC.InputPeer inputPeer = this.d;
                m = inputPeer != null ? cf3.m(inputPeer) : 0L;
            }
            TLRPC.User user2 = sy9Var.c;
            if (user2 != null) {
                j = user2.id;
            } else {
                TLRPC.InputPeer inputPeer2 = sy9Var.d;
                if (inputPeer2 != null) {
                    j = cf3.m(inputPeer2);
                }
            }
            if (m != j) {
                return false;
            }
        }
        int i2 = this.a;
        if (i2 == 6 && this.e != sy9Var.e) {
            return false;
        }
        if (i2 == 7 && !TextUtils.equals(this.f, sy9Var.f)) {
            return false;
        }
        if (this.a == 8 && !TextUtils.equals(this.f, sy9Var.f)) {
            return false;
        }
        if (this.a != 9 || (TextUtils.equals(this.f, sy9Var.f) && this.h == sy9Var.h && this.i == sy9Var.i)) {
            return this.a != 10 || this.p == sy9Var.p;
        }
        return false;
    }
}
