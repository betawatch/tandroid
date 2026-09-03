package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class t00 extends bg.b {
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

    public static t00 b(int i10, String str, boolean z4) {
        t00 t00Var = new t00(4, false);
        t00Var.k = i10;
        t00Var.d = str;
        t00Var.l = z4;
        return t00Var;
    }

    public static t00 c(int i10, String str, String str2, boolean z4) {
        t00 t00Var = new t00(1, false);
        t00Var.g = z4;
        t00Var.d = str;
        t00Var.i = str2;
        t00Var.j = i10;
        return t00Var;
    }

    public static t00 d(String str) {
        t00 t00Var = new t00(TextUtils.isEmpty(str) ? 3 : 6, false);
        t00Var.d = str;
        return t00Var;
    }

    public final boolean equals(Object obj) {
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite2;
        if (this != obj) {
            if (obj == null || t00.class != obj.getClass()) {
                return false;
            }
            t00 t00Var = (t00) obj;
            int i10 = this.a;
            if (i10 != t00Var.a) {
                return false;
            }
            if (i10 == 11) {
                if (!TextUtils.equals(this.d, t00Var.d) || !TextUtils.equals(this.e, t00Var.e)) {
                    return false;
                }
            } else {
                if ((i10 == 0 || i10 == 1 || i10 == 3 || i10 == 4) && !TextUtils.equals(this.d, t00Var.d)) {
                    return false;
                }
                int i11 = this.a;
                if (i11 == 0) {
                    if (this.f != t00Var.f) {
                        return false;
                    }
                } else if (i11 == 1) {
                    if (this.h != t00Var.h || !TextUtils.equals(this.i, t00Var.i) || this.j != t00Var.j) {
                        return false;
                    }
                } else if (i11 == 7 && (tL_exportedChatlistInvite = this.m) != (tL_exportedChatlistInvite2 = t00Var.m)) {
                    if (!TextUtils.equals(tL_exportedChatlistInvite.url, tL_exportedChatlistInvite2.url)) {
                        return false;
                    }
                    TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite3 = this.m;
                    boolean z4 = tL_exportedChatlistInvite3.revoked;
                    TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite4 = t00Var.m;
                    if (z4 != tL_exportedChatlistInvite4.revoked || !TextUtils.equals(tL_exportedChatlistInvite3.title, tL_exportedChatlistInvite4.title) || this.m.peers.size() != t00Var.m.peers.size()) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
