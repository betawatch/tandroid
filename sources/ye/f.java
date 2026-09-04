package ye;

import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class f extends df.a {
    public final /* synthetic */ int a;
    public final bf.a b;
    public final Serializable c;

    public f() {
        this.a = 1;
        this.b = new bf.l();
        this.c = new ArrayList();
    }

    @Override // df.a
    public void a(CharSequence charSequence) {
        switch (this.a) {
            case 1:
                ((ArrayList) this.c).add(charSequence);
                break;
        }
    }

    @Override // df.a
    public void d() {
        int i10;
        switch (this.a) {
            case 1:
                ArrayList arrayList = (ArrayList) this.c;
                int size = arrayList.size() - 1;
                while (true) {
                    if (size >= 0) {
                        CharSequence charSequence = (CharSequence) arrayList.get(size);
                        int length = charSequence.length();
                        int i11 = 0;
                        while (true) {
                            if (i11 < length) {
                                char charAt = charSequence.charAt(i11);
                                if (charAt != ' ') {
                                    switch (charAt) {
                                    }
                                }
                                i11++;
                            } else {
                                i11 = -1;
                            }
                        }
                        if (i11 == -1) {
                            size--;
                        }
                    }
                }
                StringBuilder sb2 = new StringBuilder();
                for (i10 = 0; i10 < size + 1; i10++) {
                    sb2.append((CharSequence) arrayList.get(i10));
                    sb2.append('\n');
                }
                ((bf.l) this.b).g = sb2.toString();
                break;
        }
    }

    @Override // df.a
    public final bf.a e() {
        switch (this.a) {
            case 0:
                return (bf.i) this.b;
            default:
                return (bf.l) this.b;
        }
    }

    @Override // df.a
    public void g(cf.a aVar) {
        switch (this.a) {
            case 0:
                aVar.a((String) this.c, (bf.i) this.b);
                break;
        }
    }

    @Override // df.a
    public final q3.h h(d dVar) {
        switch (this.a) {
            case 0:
                return null;
            default:
                if (dVar.g >= 4) {
                    return new q3.h(-1, dVar.c + 4, false);
                }
                if (dVar.h) {
                    return q3.h.a(dVar.e);
                }
                return null;
        }
    }

    public f(int i10, String str) {
        this.a = 0;
        bf.i iVar = new bf.i();
        this.b = iVar;
        iVar.g = i10;
        this.c = str;
    }
}
