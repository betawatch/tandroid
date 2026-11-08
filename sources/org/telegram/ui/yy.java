package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class yy extends rg.a {
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

    public static yy b(int i7, String str, boolean z9) {
        yy yyVar = new yy(4, false);
        yyVar.k = i7;
        yyVar.d = str;
        yyVar.l = z9;
        return yyVar;
    }

    public static yy c(int i7, String str, String str2, boolean z9) {
        yy yyVar = new yy(1, false);
        yyVar.g = z9;
        yyVar.d = str;
        yyVar.i = str2;
        yyVar.j = i7;
        return yyVar;
    }

    public static yy d(String str) {
        yy yyVar = new yy(TextUtils.isEmpty(str) ? 3 : 6, false);
        yyVar.d = str;
        return yyVar;
    }

    public final boolean equals(Object obj) {
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite2;
        if (this != obj) {
            if (obj == null || yy.class != obj.getClass()) {
                return false;
            }
            yy yyVar = (yy) obj;
            int i7 = this.a;
            if (i7 != yyVar.a) {
                return false;
            }
            if (i7 == 11) {
                if (!TextUtils.equals(this.d, yyVar.d) || !TextUtils.equals(this.e, yyVar.e)) {
                    return false;
                }
            } else {
                if ((i7 == 0 || i7 == 1 || i7 == 3 || i7 == 4) && !TextUtils.equals(this.d, yyVar.d)) {
                    return false;
                }
                int i10 = this.a;
                if (i10 == 0) {
                    if (this.f != yyVar.f) {
                        return false;
                    }
                } else if (i10 == 1) {
                    if (this.h != yyVar.h || !TextUtils.equals(this.i, yyVar.i) || this.j != yyVar.j) {
                        return false;
                    }
                } else if (i10 == 7 && (tL_exportedChatlistInvite = this.m) != (tL_exportedChatlistInvite2 = yyVar.m)) {
                    if (!TextUtils.equals(tL_exportedChatlistInvite.url, tL_exportedChatlistInvite2.url)) {
                        return false;
                    }
                    TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite3 = this.m;
                    boolean z9 = tL_exportedChatlistInvite3.revoked;
                    TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite4 = yyVar.m;
                    if (z9 != tL_exportedChatlistInvite4.revoked || !TextUtils.equals(tL_exportedChatlistInvite3.title, tL_exportedChatlistInvite4.title) || this.m.peers.size() != yyVar.m.peers.size()) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
