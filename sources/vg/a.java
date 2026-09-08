package vg;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class a extends pg.a {
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

    public static a b(TLRPC.Chat chat, int i10, boolean z10) {
        a aVar = new a(9, false);
        aVar.e = chat;
        aVar.d = null;
        aVar.g = z10;
        aVar.i = i10;
        return aVar;
    }

    public static a c(CharSequence charSequence, boolean z10) {
        a aVar = new a(7, false);
        aVar.c = charSequence;
        aVar.g = z10;
        return aVar;
    }

    public static a d(TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption, int i10, long j3, boolean z10, boolean z11) {
        a aVar = new a(17, z10);
        aVar.i = i10;
        aVar.h = j3;
        aVar.m = tL_starsGiveawayOption;
        aVar.g = z11;
        return aVar;
    }

    public static a e(int i10, int i11, boolean z10, ArrayList arrayList) {
        a aVar = new a(11, i11 == i10);
        aVar.l = i10;
        aVar.g = z10;
        aVar.f = arrayList;
        return aVar;
    }

    public static a f(String str) {
        a aVar = new a(6, false);
        aVar.c = str;
        return aVar;
    }

    public static boolean g(List list, List list2) {
        if (list == null && list2 == null) {
            return true;
        }
        if (list == null || list2 == null || list.size() != list2.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (((Integer) list.get(i10)).intValue() != ((Integer) list2.get(i10)).intValue()) {
                return false;
            }
        }
        return true;
    }

    @Override // pg.a
    public final boolean a(pg.a aVar) {
        a aVar2;
        int i10;
        int i11;
        if (this == aVar) {
            return true;
        }
        if (a.class == aVar.getClass() && (i10 = (aVar2 = (a) aVar).a) == (i11 = this.a)) {
            return i11 == 0 ? this.g == aVar2.g : i10 == 17 ? this.i == aVar2.i && this.h == aVar2.h && this.m == aVar2.m && this.g == aVar2.g && this.b == aVar2.b : i11 == 5 ? this.i == aVar2.i && g(this.k, aVar2.k) : i11 == 13 && this.i == aVar2.i && TextUtils.equals(this.c, aVar2.c);
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        int i10 = this.a;
        if (i10 != aVar.a) {
            return false;
        }
        if (i10 == 0) {
            return true;
        }
        return i10 == 17 ? this.i == aVar.i && this.m == aVar.m : i10 == 5 ? g(this.k, aVar.k) : i10 == 13 ? TextUtils.equals(this.c, aVar.c) : this.e == aVar.e && this.f == aVar.f && this.d == aVar.d && this.m == aVar.m && this.g == aVar.g && this.i == aVar.i && this.j == aVar.j && this.h == aVar.h && this.l == aVar.l && TextUtils.equals(this.c, aVar.c);
    }
}
