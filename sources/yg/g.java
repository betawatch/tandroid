package yg;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.m5;
import org.telegram.tgnet.TLRPC;
import xg.z0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class g extends sg.a {
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
    public org.telegram.ui.web.d m;
    public org.telegram.ui.web.d n;
    public z0 o;
    public z0 p;
    public View q;
    public Drawable r;

    public g(int i3, boolean z10) {
        super(i3, z10);
        this.l = -1;
    }

    public static g b(CharSequence charSequence) {
        g gVar = new g(8, false);
        gVar.g = charSequence;
        return gVar;
    }

    public static g c(TLRPC.User user, boolean z10) {
        g gVar = new g(3, true);
        gVar.c = user;
        gVar.d = null;
        gVar.e = null;
        gVar.k = z10;
        return gVar;
    }

    @Override // sg.a
    public final boolean a(sg.a aVar) {
        if (this != aVar) {
            if (g.class == aVar.getClass()) {
                g gVar = (g) aVar;
                if (this.k == gVar.k) {
                    if (this.a == 8) {
                        if (TextUtils.equals(this.h, gVar.h)) {
                            if ((this.m == null) == (gVar.m == null)) {
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
        long n4;
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        int i3 = this.a;
        if (i3 != gVar.a) {
            return false;
        }
        if (i3 == -1 && this.l != gVar.l) {
            return false;
        }
        if (i3 == 3) {
            TLRPC.User user = this.c;
            long j10 = 0;
            if (user != null) {
                n4 = user.id;
            } else {
                TLRPC.Chat chat = this.e;
                if (chat != null) {
                    n4 = -chat.id;
                } else {
                    TLRPC.InputPeer inputPeer = this.d;
                    n4 = inputPeer != null ? m5.n(inputPeer) : 0L;
                }
            }
            TLRPC.User user2 = gVar.c;
            if (user2 != null) {
                j10 = user2.id;
            } else {
                TLRPC.Chat chat2 = gVar.e;
                if (chat2 != null) {
                    j10 = -chat2.id;
                } else {
                    TLRPC.InputPeer inputPeer2 = gVar.d;
                    if (inputPeer2 != null) {
                        j10 = m5.n(inputPeer2);
                    }
                }
            }
            if (n4 != j10) {
                return false;
            }
        }
        int i10 = this.a;
        if (i10 == 6 && this.f != gVar.f) {
            return false;
        }
        if (i10 == 7 && !TextUtils.equals(this.g, gVar.g)) {
            return false;
        }
        if (this.a == 8 && !TextUtils.equals(this.g, gVar.g)) {
            return false;
        }
        if (this.a != 9 || (TextUtils.equals(this.g, gVar.g) && this.i == gVar.i && this.j == gVar.j)) {
            return this.a != 10 || this.q == gVar.q;
        }
        return false;
    }
}
