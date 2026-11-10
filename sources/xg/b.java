package xg;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class b extends rg.a {
    public CharSequence c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat e;
    public Object f;
    public boolean g;
    public long h;
    public int i;
    public int j;
    public List k;
    public int l;
    public TLObject m;

    public static b b(int i7, TLRPC.Chat chat, boolean z9) {
        b bVar = new b(9, false);
        bVar.e = chat;
        bVar.d = null;
        bVar.g = z9;
        bVar.i = i7;
        return bVar;
    }

    public static b c(CharSequence charSequence, boolean z9) {
        b bVar = new b(7, false);
        bVar.c = charSequence;
        bVar.g = z9;
        return bVar;
    }

    public static b d(TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption, int i7, long j3, boolean z9, boolean z10) {
        b bVar = new b(17, z9);
        bVar.i = i7;
        bVar.h = j3;
        bVar.m = tL_starsGiveawayOption;
        bVar.g = z10;
        return bVar;
    }

    public static b e(int i7, int i10, boolean z9, ArrayList arrayList) {
        b bVar = new b(11, i10 == i7);
        bVar.l = i7;
        bVar.g = z9;
        bVar.f = arrayList;
        return bVar;
    }

    public static b f(String str) {
        b bVar = new b(6, false);
        bVar.c = str;
        return bVar;
    }

    public static boolean g(List list, List list2) {
        if (list == null && list2 == null) {
            return true;
        }
        if (list == null || list2 == null || list.size() != list2.size()) {
            return false;
        }
        for (int i7 = 0; i7 < list.size(); i7++) {
            if (((Integer) list.get(i7)).intValue() != ((Integer) list2.get(i7)).intValue()) {
                return false;
            }
        }
        return true;
    }

    @Override // rg.a
    public final boolean a(rg.a aVar) {
        b bVar;
        int i7;
        int i10;
        if (this == aVar) {
            return true;
        }
        if (b.class == aVar.getClass() && (i7 = (bVar = (b) aVar).a) == (i10 = this.a)) {
            return i10 == 0 ? this.g == bVar.g : i7 == 17 ? this.i == bVar.i && this.h == bVar.h && this.m == bVar.m && this.g == bVar.g && this.b == bVar.b : i10 == 5 ? this.i == bVar.i && g(this.k, bVar.k) : i10 == 13 && this.i == bVar.i && TextUtils.equals(this.c, bVar.c);
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        int i7 = this.a;
        if (i7 != bVar.a) {
            return false;
        }
        if (i7 == 0) {
            return true;
        }
        return i7 == 17 ? this.i == bVar.i && this.m == bVar.m : i7 == 5 ? g(this.k, bVar.k) : i7 == 13 ? TextUtils.equals(this.c, bVar.c) : this.e == bVar.e && this.f == bVar.f && this.d == bVar.d && this.m == bVar.m && this.g == bVar.g && this.i == bVar.i && this.j == bVar.j && this.h == bVar.h && this.l == bVar.l && TextUtils.equals(this.c, bVar.c);
    }
}
