package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class zy extends rg.a {
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

    public static zy b(int i7, String str, boolean z10) {
        zy zyVar = new zy(4, false);
        zyVar.k = i7;
        zyVar.d = str;
        zyVar.l = z10;
        return zyVar;
    }

    public static zy c(int i7, String str, String str2, boolean z10) {
        zy zyVar = new zy(1, false);
        zyVar.g = z10;
        zyVar.d = str;
        zyVar.i = str2;
        zyVar.j = i7;
        return zyVar;
    }

    public static zy d(String str) {
        zy zyVar = new zy(TextUtils.isEmpty(str) ? 3 : 6, false);
        zyVar.d = str;
        return zyVar;
    }

    public final boolean equals(Object obj) {
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite2;
        if (this != obj) {
            if (obj == null || zy.class != obj.getClass()) {
                return false;
            }
            zy zyVar = (zy) obj;
            int i7 = this.a;
            if (i7 != zyVar.a) {
                return false;
            }
            if (i7 == 11) {
                if (!TextUtils.equals(this.d, zyVar.d) || !TextUtils.equals(this.e, zyVar.e)) {
                    return false;
                }
            } else {
                if ((i7 == 0 || i7 == 1 || i7 == 3 || i7 == 4) && !TextUtils.equals(this.d, zyVar.d)) {
                    return false;
                }
                int i10 = this.a;
                if (i10 == 0) {
                    if (this.f != zyVar.f) {
                        return false;
                    }
                } else if (i10 == 1) {
                    if (this.h != zyVar.h || !TextUtils.equals(this.i, zyVar.i) || this.j != zyVar.j) {
                        return false;
                    }
                } else if (i10 == 7 && (tL_exportedChatlistInvite = this.m) != (tL_exportedChatlistInvite2 = zyVar.m)) {
                    if (!TextUtils.equals(tL_exportedChatlistInvite.url, tL_exportedChatlistInvite2.url)) {
                        return false;
                    }
                    TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite3 = this.m;
                    boolean z10 = tL_exportedChatlistInvite3.revoked;
                    TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite4 = zyVar.m;
                    if (z10 != tL_exportedChatlistInvite4.revoked || !TextUtils.equals(tL_exportedChatlistInvite3.title, tL_exportedChatlistInvite4.title) || this.m.peers.size() != zyVar.m.peers.size()) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
