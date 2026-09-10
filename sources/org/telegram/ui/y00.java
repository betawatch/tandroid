package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class y00 extends ng.a {
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

    public static y00 b(int i10, String str, boolean z10) {
        y00 y00Var = new y00(4, false);
        y00Var.k = i10;
        y00Var.d = str;
        y00Var.l = z10;
        return y00Var;
    }

    public static y00 c(int i10, String str, String str2, boolean z10) {
        y00 y00Var = new y00(1, false);
        y00Var.g = z10;
        y00Var.d = str;
        y00Var.i = str2;
        y00Var.j = i10;
        return y00Var;
    }

    public static y00 d(String str) {
        y00 y00Var = new y00(TextUtils.isEmpty(str) ? 3 : 6, false);
        y00Var.d = str;
        return y00Var;
    }

    public final boolean equals(Object obj) {
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite2;
        if (this != obj) {
            if (obj == null || y00.class != obj.getClass()) {
                return false;
            }
            y00 y00Var = (y00) obj;
            int i10 = this.a;
            if (i10 != y00Var.a) {
                return false;
            }
            if (i10 == 11) {
                if (!TextUtils.equals(this.d, y00Var.d) || !TextUtils.equals(this.e, y00Var.e)) {
                    return false;
                }
            } else {
                if ((i10 == 0 || i10 == 1 || i10 == 3 || i10 == 4) && !TextUtils.equals(this.d, y00Var.d)) {
                    return false;
                }
                int i11 = this.a;
                if (i11 == 0) {
                    if (this.f != y00Var.f) {
                        return false;
                    }
                } else if (i11 == 1) {
                    if (this.h != y00Var.h || !TextUtils.equals(this.i, y00Var.i) || this.j != y00Var.j) {
                        return false;
                    }
                } else if (i11 == 7 && (tL_exportedChatlistInvite = this.m) != (tL_exportedChatlistInvite2 = y00Var.m)) {
                    if (!TextUtils.equals(tL_exportedChatlistInvite.url, tL_exportedChatlistInvite2.url)) {
                        return false;
                    }
                    TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite3 = this.m;
                    boolean z10 = tL_exportedChatlistInvite3.revoked;
                    TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite4 = y00Var.m;
                    if (z10 != tL_exportedChatlistInvite4.revoked || !TextUtils.equals(tL_exportedChatlistInvite3.title, tL_exportedChatlistInvite4.title) || this.m.peers.size() != y00Var.m.peers.size()) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
