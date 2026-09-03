package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class s00 extends cg.b {
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

    public static s00 b(int i10, String str, boolean z4) {
        s00 s00Var = new s00(4, false);
        s00Var.k = i10;
        s00Var.d = str;
        s00Var.l = z4;
        return s00Var;
    }

    public static s00 c(int i10, String str, String str2, boolean z4) {
        s00 s00Var = new s00(1, false);
        s00Var.g = z4;
        s00Var.d = str;
        s00Var.i = str2;
        s00Var.j = i10;
        return s00Var;
    }

    public static s00 d(String str) {
        s00 s00Var = new s00(TextUtils.isEmpty(str) ? 3 : 6, false);
        s00Var.d = str;
        return s00Var;
    }

    public final boolean equals(Object obj) {
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite2;
        if (this != obj) {
            if (obj == null || s00.class != obj.getClass()) {
                return false;
            }
            s00 s00Var = (s00) obj;
            int i10 = this.a;
            if (i10 != s00Var.a) {
                return false;
            }
            if (i10 == 11) {
                if (!TextUtils.equals(this.d, s00Var.d) || !TextUtils.equals(this.e, s00Var.e)) {
                    return false;
                }
            } else {
                if ((i10 == 0 || i10 == 1 || i10 == 3 || i10 == 4) && !TextUtils.equals(this.d, s00Var.d)) {
                    return false;
                }
                int i11 = this.a;
                if (i11 == 0) {
                    if (this.f != s00Var.f) {
                        return false;
                    }
                } else if (i11 == 1) {
                    if (this.h != s00Var.h || !TextUtils.equals(this.i, s00Var.i) || this.j != s00Var.j) {
                        return false;
                    }
                } else if (i11 == 7 && (tL_exportedChatlistInvite = this.m) != (tL_exportedChatlistInvite2 = s00Var.m)) {
                    if (!TextUtils.equals(tL_exportedChatlistInvite.url, tL_exportedChatlistInvite2.url)) {
                        return false;
                    }
                    TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite3 = this.m;
                    boolean z4 = tL_exportedChatlistInvite3.revoked;
                    TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite4 = s00Var.m;
                    if (z4 != tL_exportedChatlistInvite4.revoked || !TextUtils.equals(tL_exportedChatlistInvite3.title, tL_exportedChatlistInvite4.title) || this.m.peers.size() != s00Var.m.peers.size()) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
