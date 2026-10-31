package org.telegram.utils.twidget;

import java.util.ArrayList;
import org.telegram.messenger.o5;
import org.telegram.messenger.vp;
import org.telegram.messenger.w3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gl0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class m {
    public boolean A;
    public boolean B;
    public int C;
    public int D;
    public boolean E;
    public int F;
    public boolean G;
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
    public Boolean o;
    public String p;
    public String q;
    public long r;
    public TLRPC.TL_messageMediaWidget s;
    public String t;
    public w u;
    public gl0 v;
    public gl0 x;
    public int y;
    public long z;
    public final ArrayList w = new ArrayList();
    public final l H = new l(this, 0);

    public m(String str, int i10, long j10, int i11, long j11, TLRPC.TL_messageMediaWidget tL_messageMediaWidget, boolean z10) {
        this.a = str;
        this.b = i10;
        this.c = j10;
        this.d = i11;
        this.n = j11;
        boolean z11 = false;
        this.e = Math.max(0, tL_messageMediaWidget.width);
        this.f = Math.max(0, tL_messageMediaWidget.height);
        this.g = tL_messageMediaWidget.payload;
        this.k = z10;
        boolean z12 = !z10 && tL_messageMediaWidget.is_copy;
        this.h = z12;
        this.i = !z10 && tL_messageMediaWidget.can_query && i11 > 0;
        if (!z10 && tL_messageMediaWidget.background_query && i11 > 0) {
            z11 = true;
        }
        this.j = z11;
        this.l = tL_messageMediaWidget.widget_id;
        String str2 = null;
        if (!z10 && !z12) {
            if (o5.E(j10)) {
                str2 = "private";
            } else {
                TLRPC.Chat L0 = vp.r1(i10).L0(Long.valueOf(-j10));
                if (L0 != null) {
                    str2 = !w3.T(L0) ? "group" : L0.megagroup ? "supergroup" : "channel";
                }
            }
        }
        this.m = str2;
        this.s = tL_messageMediaWidget;
        this.p = p.A(tL_messageMediaWidget.chat_data);
        this.q = p.A(tL_messageMediaWidget.public_data);
        this.r = tL_messageMediaWidget.public_data_hash;
    }

    public final String a() {
        long j10 = this.c;
        return p.z(this.b, this.d, j10);
    }
}
