package org.telegram.utils.twidget;

import java.util.ArrayList;
import org.telegram.messenger.m5;
import org.telegram.messenger.qp;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ck0;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final class k0 {
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
    public v0 t;
    public ck0 u;
    public ck0 w;
    public int x;
    public long y;
    public boolean z;
    public final ArrayList v = new ArrayList();
    public final j0 G = new j0(this, 0);

    public k0(String str, int i7, long j3, int i10, long j10, TLRPC.TL_messageMediaWidget tL_messageMediaWidget, boolean z9) {
        this.a = str;
        this.b = i7;
        this.c = j3;
        this.d = i10;
        this.n = j10;
        boolean z10 = false;
        this.e = Math.max(0, tL_messageMediaWidget.width);
        this.f = Math.max(0, tL_messageMediaWidget.height);
        this.g = tL_messageMediaWidget.payload;
        this.k = z9;
        boolean z11 = !z9 && tL_messageMediaWidget.is_copy;
        this.h = z11;
        this.i = !z9 && tL_messageMediaWidget.can_query && i10 > 0;
        if (!z9 && tL_messageMediaWidget.background_query && i10 > 0) {
            z10 = true;
        }
        this.j = z10;
        this.l = tL_messageMediaWidget.widget_id;
        String str2 = null;
        if (!z9 && !z11) {
            if (m5.E(j3)) {
                str2 = "private";
            } else {
                TLRPC.Chat M0 = qp.s1(i7).M0(Long.valueOf(-j3));
                if (M0 != null) {
                    str2 = !t3.T(M0) ? "group" : M0.megagroup ? "supergroup" : "channel";
                }
            }
        }
        this.m = str2;
        this.r = tL_messageMediaWidget;
        this.o = n0.C(tL_messageMediaWidget.chat_data);
        this.p = n0.C(tL_messageMediaWidget.public_data);
        this.q = tL_messageMediaWidget.public_data_hash;
    }

    public final String a() {
        long j3 = this.c;
        return n0.B(this.b, this.d, j3);
    }
}
