package xg;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.n5;
import org.telegram.tgnet.TLRPC;
import ug.a0;
import wg.z0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class g extends rg.a {
    public TLRPC.User c;
    public TLRPC.InputPeer d;
    public TLRPC.TL_help_country e;
    public CharSequence f;
    public String g;
    public int h;
    public int i;
    public boolean j;
    public int k;
    public a0 l;
    public a0 m;
    public z0 n;
    public z0 o;
    public View p;

    public g(int i7, boolean z10) {
        super(i7, z10);
        this.k = -1;
    }

    public static g b(CharSequence charSequence) {
        g gVar = new g(8, false);
        gVar.f = charSequence;
        return gVar;
    }

    public static g c(TLRPC.User user, boolean z10) {
        g gVar = new g(3, true);
        gVar.c = user;
        gVar.d = null;
        gVar.j = z10;
        return gVar;
    }

    @Override // rg.a
    public final boolean a(rg.a aVar) {
        if (this != aVar) {
            if (g.class == aVar.getClass()) {
                g gVar = (g) aVar;
                if (this.j == gVar.j) {
                    if (this.a == 8) {
                        if (TextUtils.equals(this.g, gVar.g)) {
                            if ((this.l == null) == (gVar.l == null)) {
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
        long n10;
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        int i7 = this.a;
        if (i7 != gVar.a) {
            return false;
        }
        if (i7 == -1 && this.k != gVar.k) {
            return false;
        }
        if (i7 == 3) {
            TLRPC.User user = this.c;
            long j3 = 0;
            if (user != null) {
                n10 = user.id;
            } else {
                TLRPC.InputPeer inputPeer = this.d;
                n10 = inputPeer != null ? n5.n(inputPeer) : 0L;
            }
            TLRPC.User user2 = gVar.c;
            if (user2 != null) {
                j3 = user2.id;
            } else {
                TLRPC.InputPeer inputPeer2 = gVar.d;
                if (inputPeer2 != null) {
                    j3 = n5.n(inputPeer2);
                }
            }
            if (n10 != j3) {
                return false;
            }
        }
        int i10 = this.a;
        if (i10 == 6 && this.e != gVar.e) {
            return false;
        }
        if (i10 == 7 && !TextUtils.equals(this.f, gVar.f)) {
            return false;
        }
        if (this.a == 8 && !TextUtils.equals(this.f, gVar.f)) {
            return false;
        }
        if (this.a != 9 || (TextUtils.equals(this.f, gVar.f) && this.h == gVar.h && this.i == gVar.i)) {
            return this.a != 10 || this.p == gVar.p;
        }
        return false;
    }
}
