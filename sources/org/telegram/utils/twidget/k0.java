package org.telegram.utils.twidget;

import java.util.ArrayList;
import org.telegram.messenger.mp;
import org.telegram.messenger.n5;
import org.telegram.messenger.v3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.pk0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class k0 {
    public boolean A;
    public int B;
    public int C;
    public int D;
    public int E;
    public double F;
    public double G;
    public double H;
    public long I;
    public boolean J;
    public int K;
    public boolean L;
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
    public d1 t;
    public pk0 u;
    public pk0 w;
    public int x;
    public long y;
    public boolean z;
    public final ArrayList v = new ArrayList();
    public final j0 M = new j0(this, 0);

    public k0(String str, int i7, long j3, int i10, long j10, TLRPC.TL_messageMediaWidget tL_messageMediaWidget, boolean z10) {
        this.a = str;
        this.b = i7;
        this.c = j3;
        this.d = i10;
        this.n = j10;
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
            if (n5.E(j3)) {
                str2 = "private";
            } else {
                TLRPC.Chat O0 = mp.u1(i7).O0(Long.valueOf(-j3));
                if (O0 != null) {
                    str2 = !v3.T(O0) ? "group" : O0.megagroup ? "supergroup" : "channel";
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
