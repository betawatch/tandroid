package xg;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.m5;
import org.telegram.tgnet.TLRPC;
import wg.a1;
import wg.z0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class h extends rg.a {
    public TLRPC.User c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat e;
    public TLRPC.TL_help_country f;
    public CharSequence g;
    public CharSequence h;
    public int i;
    public int j;
    public boolean k;
    public int l;
    public z0 m;
    public z0 n;
    public a1 o;
    public a1 p;
    public View q;
    public Drawable r;

    public h(int i7, boolean z9) {
        super(i7, z9);
        this.l = -1;
    }

    public static h b(CharSequence charSequence) {
        h hVar = new h(8, false);
        hVar.g = charSequence;
        return hVar;
    }

    public static h c(TLRPC.User user, boolean z9) {
        h hVar = new h(3, true);
        hVar.c = user;
        hVar.d = null;
        hVar.e = null;
        hVar.k = z9;
        return hVar;
    }

    @Override // rg.a
    public final boolean a(rg.a aVar) {
        if (this != aVar) {
            if (h.class == aVar.getClass()) {
                h hVar = (h) aVar;
                if (this.k == hVar.k) {
                    if (this.a == 8) {
                        if (TextUtils.equals(this.h, hVar.h)) {
                            if ((this.m == null) == (hVar.m == null)) {
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
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        int i7 = this.a;
        if (i7 != hVar.a) {
            return false;
        }
        if (i7 == -1 && this.l != hVar.l) {
            return false;
        }
        if (i7 == 3) {
            TLRPC.User user = this.c;
            long j3 = 0;
            if (user != null) {
                n10 = user.id;
            } else {
                TLRPC.Chat chat = this.e;
                if (chat != null) {
                    n10 = -chat.id;
                } else {
                    TLRPC.InputPeer inputPeer = this.d;
                    n10 = inputPeer != null ? m5.n(inputPeer) : 0L;
                }
            }
            TLRPC.User user2 = hVar.c;
            if (user2 != null) {
                j3 = user2.id;
            } else {
                TLRPC.Chat chat2 = hVar.e;
                if (chat2 != null) {
                    j3 = -chat2.id;
                } else {
                    TLRPC.InputPeer inputPeer2 = hVar.d;
                    if (inputPeer2 != null) {
                        j3 = m5.n(inputPeer2);
                    }
                }
            }
            if (n10 != j3) {
                return false;
            }
        }
        int i10 = this.a;
        if (i10 == 6 && this.f != hVar.f) {
            return false;
        }
        if (i10 == 7 && !TextUtils.equals(this.g, hVar.g)) {
            return false;
        }
        if (this.a == 8 && !TextUtils.equals(this.g, hVar.g)) {
            return false;
        }
        if (this.a != 9 || (TextUtils.equals(this.g, hVar.g) && this.i == hVar.i && this.j == hVar.j)) {
            return this.a != 10 || this.q == hVar.q;
        }
        return false;
    }
}
