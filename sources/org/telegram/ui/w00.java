package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class w00 extends pg.a {
    public View.OnClickListener c;
    public CharSequence d;
    public String e;
    public boolean f;
    public boolean g;
    public long h;
    public String i;
    public int j;
    public int k;
    public boolean l;
    public TL_chatlists.TL_exportedChatlistInvite m;

    public static w00 b(int i10, String str, boolean z10) {
        w00 w00Var = new w00(4, false);
        w00Var.k = i10;
        w00Var.d = str;
        w00Var.l = z10;
        return w00Var;
    }

    public static w00 c(int i10, String str, String str2, boolean z10) {
        w00 w00Var = new w00(1, false);
        w00Var.g = z10;
        w00Var.d = str;
        w00Var.i = str2;
        w00Var.j = i10;
        return w00Var;
    }

    public static w00 d(String str) {
        w00 w00Var = new w00(TextUtils.isEmpty(str) ? 3 : 6, false);
        w00Var.d = str;
        return w00Var;
    }

    public final boolean equals(Object obj) {
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite2;
        if (this != obj) {
            if (obj == null || w00.class != obj.getClass()) {
                return false;
            }
            w00 w00Var = (w00) obj;
            int i10 = this.a;
            if (i10 != w00Var.a) {
                return false;
            }
            if (i10 == 11) {
                if (!TextUtils.equals(this.d, w00Var.d) || !TextUtils.equals(this.e, w00Var.e)) {
                    return false;
                }
            } else {
                if ((i10 == 0 || i10 == 1 || i10 == 3 || i10 == 4) && !TextUtils.equals(this.d, w00Var.d)) {
                    return false;
                }
                int i11 = this.a;
                if (i11 == 0) {
                    if (this.f != w00Var.f) {
                        return false;
                    }
                } else if (i11 == 1) {
                    if (this.h != w00Var.h || !TextUtils.equals(this.i, w00Var.i) || this.j != w00Var.j) {
                        return false;
                    }
                } else if (i11 == 7 && (tL_exportedChatlistInvite = this.m) != (tL_exportedChatlistInvite2 = w00Var.m)) {
                    if (!TextUtils.equals(tL_exportedChatlistInvite.url, tL_exportedChatlistInvite2.url)) {
                        return false;
                    }
                    TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite3 = this.m;
                    boolean z10 = tL_exportedChatlistInvite3.revoked;
                    TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite4 = w00Var.m;
                    if (z10 != tL_exportedChatlistInvite4.revoked || !TextUtils.equals(tL_exportedChatlistInvite3.title, tL_exportedChatlistInvite4.title) || this.m.peers.size() != w00Var.m.peers.size()) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
