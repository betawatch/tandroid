package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class zz extends hg.b {
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

    public static zz b(int i10, String str, boolean z10) {
        zz zzVar = new zz(4, false);
        zzVar.k = i10;
        zzVar.d = str;
        zzVar.l = z10;
        return zzVar;
    }

    public static zz c(int i10, String str, String str2, boolean z10) {
        zz zzVar = new zz(1, false);
        zzVar.g = z10;
        zzVar.d = str;
        zzVar.i = str2;
        zzVar.j = i10;
        return zzVar;
    }

    public static zz d(String str) {
        zz zzVar = new zz(TextUtils.isEmpty(str) ? 3 : 6, false);
        zzVar.d = str;
        return zzVar;
    }

    public final boolean equals(Object obj) {
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite2;
        if (this != obj) {
            if (obj == null || zz.class != obj.getClass()) {
                return false;
            }
            zz zzVar = (zz) obj;
            int i10 = this.a;
            if (i10 != zzVar.a) {
                return false;
            }
            if (i10 == 11) {
                if (!TextUtils.equals(this.d, zzVar.d) || !TextUtils.equals(this.e, zzVar.e)) {
                    return false;
                }
            } else {
                if ((i10 == 0 || i10 == 1 || i10 == 3 || i10 == 4) && !TextUtils.equals(this.d, zzVar.d)) {
                    return false;
                }
                int i11 = this.a;
                if (i11 == 0) {
                    if (this.f != zzVar.f) {
                        return false;
                    }
                } else if (i11 == 1) {
                    if (this.h != zzVar.h || !TextUtils.equals(this.i, zzVar.i) || this.j != zzVar.j) {
                        return false;
                    }
                } else if (i11 == 7 && (tL_exportedChatlistInvite = this.m) != (tL_exportedChatlistInvite2 = zzVar.m)) {
                    if (!TextUtils.equals(tL_exportedChatlistInvite.url, tL_exportedChatlistInvite2.url)) {
                        return false;
                    }
                    TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite3 = this.m;
                    boolean z10 = tL_exportedChatlistInvite3.revoked;
                    TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite4 = zzVar.m;
                    if (z10 != tL_exportedChatlistInvite4.revoked || !TextUtils.equals(tL_exportedChatlistInvite3.title, tL_exportedChatlistInvite4.title) || this.m.peers.size() != zzVar.m.peers.size()) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
