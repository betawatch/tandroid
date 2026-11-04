package org.telegram.utils.twidget;

import java.util.ArrayList;
import org.telegram.messenger.hp;
import org.telegram.messenger.m5;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gk0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class m {
    public boolean A;
    public int B;
    public int C;
    public boolean D;
    public int E;
    public boolean F;
    public final String a;
    public final int b;
    public final long c;
    public final int d;
    public final int e;
    public final int f;
    public final byte[] g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final long l;
    public final String m;
    public final long n;
    public String o;
    public String p;
    public long q;
    public TLRPC.TL_messageMediaWidget r;
    public String s;
    public u t;
    public gk0 u;
    public gk0 w;
    public int x;
    public long y;
    public boolean z;
    public final ArrayList v = new ArrayList();
    public final l G = new l(this, 0);

    public m(String str, int i3, long j10, int i10, long j11, TLRPC.TL_messageMediaWidget tL_messageMediaWidget, boolean z10) {
        this.a = str;
        this.b = i3;
        this.c = j10;
        this.d = i10;
        this.n = j11;
        boolean z11 = false;
        this.e = Math.max(0, tL_messageMediaWidget.width);
        this.f = Math.max(0, tL_messageMediaWidget.height);
        this.g = tL_messageMediaWidget.payload;
        this.k = z10;
        boolean z12 = !z10 && tL_messageMediaWidget.is_copy;
        this.h = z12;
        this.i = !z10 && tL_messageMediaWidget.can_query && i10 > 0;
        if (!z10 && tL_messageMediaWidget.background_query && i10 > 0) {
            z11 = true;
        }
        this.j = z11;
        this.l = tL_messageMediaWidget.widget_id;
        String str2 = null;
        if (!z10 && !z12) {
            if (m5.E(j10)) {
                str2 = "private";
            } else {
                TLRPC.Chat M0 = hp.s1(i3).M0(Long.valueOf(-j10));
                if (M0 != null) {
                    str2 = !t3.T(M0) ? "group" : M0.megagroup ? "supergroup" : "channel";
                }
            }
        }
        this.m = str2;
        this.r = tL_messageMediaWidget;
        this.o = p.A(tL_messageMediaWidget.chat_data);
        this.p = p.A(tL_messageMediaWidget.public_data);
        this.q = tL_messageMediaWidget.public_data_hash;
    }

    public final String a() {
        long j10 = this.c;
        return p.z(this.b, this.d, j10);
    }
}
