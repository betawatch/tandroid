package vg;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.oq;
import org.telegram.ui.wy0;
import ug.d1;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class f extends pg.a {
    public TLRPC.User c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat e;
    public TLRPC.TL_help_country f;
    public CharSequence g;
    public String h;
    public int i;
    public int j;
    public boolean k;
    public int l;
    public wy0 m;
    public wy0 n;
    public d1 o;
    public d1 p;
    public View q;
    public oq r;

    public f(int i10, boolean z10) {
        super(i10, z10);
        this.l = -1;
    }

    public static f b(CharSequence charSequence) {
        f fVar = new f(8, false);
        fVar.g = charSequence;
        return fVar;
    }

    public static f c(TLRPC.User user, boolean z10) {
        f fVar = new f(3, true);
        fVar.c = user;
        fVar.d = null;
        fVar.e = null;
        fVar.k = z10;
        return fVar;
    }

    @Override // pg.a
    public final boolean a(pg.a aVar) {
        if (this != aVar) {
            if (f.class == aVar.getClass()) {
                f fVar = (f) aVar;
                if (this.k == fVar.k) {
                    if (this.a == 8) {
                        if (TextUtils.equals(this.h, fVar.h)) {
                            if ((this.m == null) == (fVar.m == null)) {
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
        long peerDialogId;
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        int i10 = this.a;
        if (i10 != fVar.a) {
            return false;
        }
        if (i10 == -1 && this.l != fVar.l) {
            return false;
        }
        if (i10 == 3) {
            TLRPC.User user = this.c;
            long j3 = 0;
            if (user != null) {
                peerDialogId = user.id;
            } else {
                TLRPC.Chat chat = this.e;
                if (chat != null) {
                    peerDialogId = -chat.id;
                } else {
                    TLRPC.InputPeer inputPeer = this.d;
                    peerDialogId = inputPeer != null ? DialogObject.getPeerDialogId(inputPeer) : 0L;
                }
            }
            TLRPC.User user2 = fVar.c;
            if (user2 != null) {
                j3 = user2.id;
            } else {
                TLRPC.Chat chat2 = fVar.e;
                if (chat2 != null) {
                    j3 = -chat2.id;
                } else {
                    TLRPC.InputPeer inputPeer2 = fVar.d;
                    if (inputPeer2 != null) {
                        j3 = DialogObject.getPeerDialogId(inputPeer2);
                    }
                }
            }
            if (peerDialogId != j3) {
                return false;
            }
        }
        int i11 = this.a;
        if (i11 == 6 && this.f != fVar.f) {
            return false;
        }
        if (i11 == 7 && !TextUtils.equals(this.g, fVar.g)) {
            return false;
        }
        if (this.a == 8 && !TextUtils.equals(this.g, fVar.g)) {
            return false;
        }
        if (this.a != 9 || (TextUtils.equals(this.g, fVar.g) && this.i == fVar.i && this.j == fVar.j)) {
            return this.a != 10 || this.q == fVar.q;
        }
        return false;
    }
}
