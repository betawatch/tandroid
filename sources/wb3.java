// default package

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class wb3 implements v84 {
    public static final int[] e = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    public static final lx6 f = new lx6(new wa3((byte) 5));
    public static final lx6 h = new lx6(new wa3((byte) 6));
    public y79 a;
    public fgf b = new fgf(17);
    public boolean c;
    public boolean d;

    public final void a(int i, ArrayList arrayList) {
        switch (i) {
            case 0:
                arrayList.add(new e4());
                break;
            case 1:
                arrayList.add(new g4());
                break;
            case 2:
                arrayList.add(new kb(1));
                break;
            case 3:
                arrayList.add(new pk(1));
                break;
            case 4:
                s84 s = f.s(0);
                if (s == null) {
                    arrayList.add(new ek4());
                    break;
                } else {
                    arrayList.add(s);
                    break;
                }
            case 5:
                arrayList.add(new cn4());
                break;
            case 6:
                arrayList.add(new tl6(this.b, 0));
                break;
            case 7:
                arrayList.add(new kh7(1));
                break;
            case 8:
                fgf fgfVar = this.b;
                int g = 512 | er4.g(3);
                ko5 ko5Var = mo5.b;
                arrayList.add(new er4(fgfVar, g, null, y79.e, null));
                arrayList.add(new sh7(this.b, nm7.p2));
                break;
            case 9:
                arrayList.add(new kq7());
                break;
            case 10:
                arrayList.add(new jw8());
                break;
            case 11:
                if (this.a == null) {
                    ko5 ko5Var2 = mo5.b;
                    this.a = y79.e;
                }
                arrayList.add(new j4c(1, 0, this.b, new vqb(0L), new de(0, this.a, (byte) 6)));
                break;
            case 12:
                utc utcVar = new utc();
                utcVar.c = (byte) 0;
                utcVar.d = -1L;
                utcVar.f = -1;
                utcVar.g = -1L;
                arrayList.add(utcVar);
                break;
            case 14:
                arrayList.add(new uf5(this.c ? 1 : 0, (byte) 1));
                break;
            case 15:
                s84 s2 = h.s(new Object[0]);
                if (s2 != null) {
                    arrayList.add(s2);
                    break;
                }
                break;
            case 16:
                arrayList.add(new qd0(0, this.b));
                break;
            case 17:
                arrayList.add(new ym0((byte) 1));
                break;
            case 18:
                arrayList.add(new td0((byte) 1));
                break;
            case 19:
                arrayList.add(new ym0((byte) 0));
                break;
            case 20:
                arrayList.add(new uf5(this.d ? 1 : 0, (byte) 0));
                break;
            case 21:
                arrayList.add(new td0((byte) 0));
                break;
        }
    }

    @Override // v84
    public final synchronized s84[] e(Uri uri, Map map) {
        ArrayList arrayList;
        int[] iArr = e;
        arrayList = new ArrayList(21);
        List list = (List) map.get("Content-Type");
        int a = fie.a((list == null || list.isEmpty()) ? null : (String) list.get(0));
        if (a != -1) {
            a(a, arrayList);
        }
        int b = fie.b(uri);
        if (b != -1 && b != a) {
            a(b, arrayList);
        }
        for (int i = 0; i < 21; i++) {
            int i2 = iArr[i];
            if (i2 != a && i2 != b) {
                a(i2, arrayList);
            }
        }
        return (s84[]) arrayList.toArray(new s84[0]);
    }
}
