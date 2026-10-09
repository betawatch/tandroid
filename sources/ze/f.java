package ze;

import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class f extends ef.a {
    public final /* synthetic */ int a;
    public final cf.a b;
    public final Serializable c;

    public f() {
        this.a = 1;
        this.b = new cf.l();
        this.c = new ArrayList();
    }

    @Override // ef.a
    public void a(CharSequence charSequence) {
        switch (this.a) {
            case 1:
                ((ArrayList) this.c).add(charSequence);
                break;
        }
    }

    @Override // ef.a
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
                ((cf.l) this.b).g = sb2.toString();
                break;
        }
    }

    @Override // ef.a
    public final cf.a e() {
        switch (this.a) {
            case 0:
                return (cf.i) this.b;
            default:
                return (cf.l) this.b;
        }
    }

    @Override // ef.a
    public void g(df.a aVar) {
        switch (this.a) {
            case 0:
                aVar.a((String) this.c, (cf.i) this.b);
                break;
        }
    }

    @Override // ef.a
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
        cf.i iVar = new cf.i();
        this.b = iVar;
        iVar.g = i10;
        this.c = str;
    }
}
