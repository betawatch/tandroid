package yc;

import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import ve.m;
import ve.r;
import w7.d8;
import w7.h9;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class e extends h {
    public static final Pattern e = i.n;

    /* JADX WARN: Removed duplicated region for block: B:27:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01cf  */
    @Override // yc.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final df.c b() {
        boolean z10;
        String str;
        String str2;
        int i10 = this.d + 1;
        this.d = i10;
        i iVar = this.a;
        f6.f fVar = iVar.i;
        if (fVar == null) {
            return f("]");
        }
        r rVar = (r) fVar.e;
        boolean z11 = fVar.b;
        if (!fVar.c) {
            iVar.i = (f6.f) fVar.f;
            return f("]");
        }
        if (c() == '(') {
            this.d++;
            e();
            i iVar2 = this.a;
            int i11 = this.d;
            iVar2.g = i11;
            int a2 = d8.a(i11, iVar2.f);
            if (a2 == -1) {
                str = null;
            } else {
                String substring = iVar2.d() == '<' ? iVar2.f.substring(iVar2.g + 1, a2 - 1) : iVar2.f.substring(iVar2.g, a2);
                iVar2.g = a2;
                str = ue.a.a(substring);
            }
            this.d = this.a.g;
            if (str != null) {
                e();
                String str3 = this.c;
                int i12 = this.d;
                if (e.matcher(str3.substring(i12 - 1, i12)).matches()) {
                    i iVar3 = this.a;
                    int i13 = this.d;
                    iVar3.g = i13;
                    int c10 = d8.c(i13, iVar3.f);
                    if (c10 == -1) {
                        str2 = null;
                    } else {
                        String substring2 = iVar3.f.substring(iVar3.g + 1, c10 - 1);
                        iVar3.g = c10;
                        str2 = ue.a.a(substring2);
                    }
                    this.d = this.a.g;
                    e();
                } else {
                    str2 = null;
                }
                if (c() == ')') {
                    this.d++;
                    z10 = true;
                } else {
                    this.d = i10;
                    z10 = false;
                }
                if (!z10) {
                    int i14 = this.d;
                    i iVar4 = this.a;
                    iVar4.g = i14;
                    if (i14 < iVar4.f.length() && iVar4.f.charAt(iVar4.g) == '[') {
                        int i15 = iVar4.g + 1;
                        int b10 = d8.b(i15, iVar4.f);
                        int i16 = b10 - i15;
                        if (b10 != -1 && i16 <= 999 && b10 < iVar4.f.length() && iVar4.f.charAt(b10) == ']') {
                            iVar4.g = b10 + 1;
                        }
                    }
                    int i17 = this.a.g;
                    this.d = i17;
                    int i18 = i17 - i14;
                    String substring3 = i18 > 2 ? this.c.substring(i14, i18 + i14) : !fVar.d ? this.c.substring(fVar.a, i10) : null;
                    if (substring3 != null) {
                        Pattern pattern = ue.a.a;
                        String replaceAll = ue.a.c.matcher(substring3.substring(1, substring3.length() - 1).trim().toLowerCase(Locale.ROOT)).replaceAll(" ");
                        i iVar5 = this.a;
                        iVar5.getClass();
                        m mVar = (m) ((Map) iVar5.a.c).get(replaceAll);
                        if (mVar != null) {
                            str = mVar.h;
                            str2 = mVar.i;
                            z10 = true;
                        }
                    }
                }
                if (z10) {
                    this.d = i10;
                    i iVar6 = this.a;
                    iVar6.i = (f6.f) iVar6.i.f;
                    return f("]");
                }
                ve.k kVar = z11 ? new ve.k(0, str, str2) : new ve.k(1, str, str2);
                df.c cVar = (df.c) rVar.f;
                while (cVar != null) {
                    df.c cVar2 = (df.c) cVar.f;
                    kVar.b(cVar);
                    cVar = cVar2;
                }
                se.b bVar = (se.b) fVar.g;
                i iVar7 = this.a;
                iVar7.g = this.d;
                iVar7.e(bVar);
                this.d = this.a.g;
                df.c cVar3 = (df.c) kVar.c;
                df.c cVar4 = (df.c) kVar.d;
                if (cVar3 != cVar4) {
                    h9.b(cVar3, cVar4);
                }
                rVar.g();
                i iVar8 = this.a;
                f6.f fVar2 = (f6.f) iVar8.i.f;
                iVar8.i = fVar2;
                if (!z11) {
                    while (fVar2 != null) {
                        if (!fVar2.b) {
                            fVar2.c = false;
                        }
                        fVar2 = (f6.f) fVar2.f;
                    }
                }
                return kVar;
            }
            z10 = false;
        } else {
            z10 = false;
            str = null;
        }
        str2 = null;
        if (!z10) {
        }
        if (z10) {
        }
    }

    @Override // yc.h
    public final char d() {
        return ']';
    }
}
