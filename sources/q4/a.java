package q4;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class a {
    public final int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public final /* synthetic */ b j;

    public a(b bVar, int i10, int i11) {
        this.j = bVar;
        this.a = i10;
        this.b = i11;
        a();
    }

    public final void a() {
        b bVar = this.j;
        int[] iArr = (int[]) bVar.a;
        int[] iArr2 = (int[]) bVar.b;
        int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i11 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i12 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i13 = TLObject.FLAG_31;
        int i14 = TLObject.FLAG_31;
        int i15 = TLObject.FLAG_31;
        int i16 = 0;
        for (int i17 = this.a; i17 <= this.b; i17++) {
            int i18 = iArr[i17];
            i16 += iArr2[i18];
            int i19 = (i18 >> 10) & 31;
            int i20 = (i18 >> 5) & 31;
            int i21 = i18 & 31;
            if (i19 > i13) {
                i13 = i19;
            }
            if (i19 < i10) {
                i10 = i19;
            }
            if (i20 > i14) {
                i14 = i20;
            }
            if (i20 < i11) {
                i11 = i20;
            }
            if (i21 > i15) {
                i15 = i21;
            }
            if (i21 < i12) {
                i12 = i21;
            }
        }
        this.d = i10;
        this.e = i13;
        this.f = i11;
        this.g = i14;
        this.h = i12;
        this.i = i15;
        this.c = i16;
    }

    public final int b() {
        return ((this.i - this.h) + 1) * ((this.g - this.f) + 1) * ((this.e - this.d) + 1);
    }
}
