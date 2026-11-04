package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class vy extends sg.a {
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

    public static vy b(int i3, String str, boolean z10) {
        vy vyVar = new vy(4, false);
        vyVar.k = i3;
        vyVar.d = str;
        vyVar.l = z10;
        return vyVar;
    }

    public static vy c(int i3, String str, String str2, boolean z10) {
        vy vyVar = new vy(1, false);
        vyVar.g = z10;
        vyVar.d = str;
        vyVar.i = str2;
        vyVar.j = i3;
        return vyVar;
    }

    public static vy d(String str) {
        vy vyVar = new vy(TextUtils.isEmpty(str) ? 3 : 6, false);
        vyVar.d = str;
        return vyVar;
    }

    public final boolean equals(Object obj) {
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite2;
        if (this != obj) {
            if (obj == null || vy.class != obj.getClass()) {
                return false;
            }
            vy vyVar = (vy) obj;
            int i3 = this.a;
            if (i3 != vyVar.a) {
                return false;
            }
            if (i3 == 11) {
                if (!TextUtils.equals(this.d, vyVar.d) || !TextUtils.equals(this.e, vyVar.e)) {
                    return false;
                }
            } else {
                if ((i3 == 0 || i3 == 1 || i3 == 3 || i3 == 4) && !TextUtils.equals(this.d, vyVar.d)) {
                    return false;
                }
                int i10 = this.a;
                if (i10 == 0) {
                    if (this.f != vyVar.f) {
                        return false;
                    }
                } else if (i10 == 1) {
                    if (this.h != vyVar.h || !TextUtils.equals(this.i, vyVar.i) || this.j != vyVar.j) {
                        return false;
                    }
                } else if (i10 == 7 && (tL_exportedChatlistInvite = this.m) != (tL_exportedChatlistInvite2 = vyVar.m)) {
                    if (!TextUtils.equals(tL_exportedChatlistInvite.url, tL_exportedChatlistInvite2.url)) {
                        return false;
                    }
                    TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite3 = this.m;
                    boolean z10 = tL_exportedChatlistInvite3.revoked;
                    TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite4 = vyVar.m;
                    if (z10 != tL_exportedChatlistInvite4.revoked || !TextUtils.equals(tL_exportedChatlistInvite3.title, tL_exportedChatlistInvite4.title) || this.m.peers.size() != vyVar.m.peers.size()) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
