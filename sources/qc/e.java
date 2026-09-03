package qc;

import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import k7.p6;
import k7.u;
import ne.m;
import ne.p;
import ne.s;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class e extends h {
    public static final Pattern e = i.n;

    /* JADX WARN: Removed duplicated region for block: B:27:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01cd  */
    @Override // qc.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final p b() {
        String str;
        String str2;
        boolean z4;
        int i10 = this.d + 1;
        this.d = i10;
        i iVar = this.a;
        ke.b bVar = iVar.i;
        if (bVar == null) {
            return f("]");
        }
        s sVar = (s) bVar.e;
        boolean z10 = bVar.a;
        if (!bVar.c) {
            iVar.i = (ke.b) bVar.f;
            return f("]");
        }
        if (c() == '(') {
            this.d++;
            e();
            i iVar2 = this.a;
            int i11 = this.d;
            iVar2.g = i11;
            int a2 = u.a(i11, iVar2.f);
            if (a2 == -1) {
                str = null;
            } else {
                String substring = iVar2.d() == '<' ? iVar2.f.substring(iVar2.g + 1, a2 - 1) : iVar2.f.substring(iVar2.g, a2);
                iVar2.g = a2;
                str = me.a.a(substring);
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
                    int c3 = u.c(i13, iVar3.f);
                    if (c3 == -1) {
                        str2 = null;
                    } else {
                        String substring2 = iVar3.f.substring(iVar3.g + 1, c3 - 1);
                        iVar3.g = c3;
                        str2 = me.a.a(substring2);
                    }
                    this.d = this.a.g;
                    e();
                } else {
                    str2 = null;
                }
                if (c() == ')') {
                    this.d++;
                    z4 = true;
                    if (!z4) {
                        int i14 = this.d;
                        i iVar4 = this.a;
                        iVar4.g = i14;
                        if (i14 < iVar4.f.length() && iVar4.f.charAt(iVar4.g) == '[') {
                            int i15 = iVar4.g + 1;
                            int b10 = u.b(i15, iVar4.f);
                            int i16 = b10 - i15;
                            if (b10 != -1 && i16 <= 999 && b10 < iVar4.f.length() && iVar4.f.charAt(b10) == ']') {
                                iVar4.g = b10 + 1;
                            }
                        }
                        int i17 = this.a.g;
                        this.d = i17;
                        int i18 = i17 - i14;
                        String substring3 = i18 > 2 ? this.c.substring(i14, i18 + i14) : !bVar.d ? this.c.substring(bVar.b, i10) : null;
                        if (substring3 != null) {
                            Pattern pattern = me.a.a;
                            String replaceAll = me.a.c.matcher(substring3.substring(1, substring3.length() - 1).trim().toLowerCase(Locale.ROOT)).replaceAll(" ");
                            i iVar5 = this.a;
                            iVar5.getClass();
                            m mVar = (m) ((Map) iVar5.a.c).get(replaceAll);
                            if (mVar != null) {
                                str = mVar.h;
                                str2 = mVar.i;
                                z4 = true;
                            }
                        }
                    }
                    if (!z4) {
                        this.d = i10;
                        i iVar6 = this.a;
                        iVar6.i = (ke.b) iVar6.i.f;
                        return f("]");
                    }
                    ne.k kVar = z10 ? new ne.k(0, str, str2) : new ne.k(1, str, str2);
                    p pVar = (p) sVar.f;
                    while (pVar != null) {
                        p pVar2 = (p) pVar.f;
                        kVar.b(pVar);
                        pVar = pVar2;
                    }
                    ke.c cVar = (ke.c) bVar.g;
                    i iVar7 = this.a;
                    iVar7.g = this.d;
                    iVar7.e(cVar);
                    this.d = this.a.g;
                    p pVar3 = (p) kVar.c;
                    p pVar4 = (p) kVar.d;
                    if (pVar3 != pVar4) {
                        p6.b(pVar3, pVar4);
                    }
                    sVar.g();
                    i iVar8 = this.a;
                    ke.b bVar2 = (ke.b) iVar8.i.f;
                    iVar8.i = bVar2;
                    if (!z10) {
                        while (bVar2 != null) {
                            if (!bVar2.a) {
                                bVar2.c = false;
                            }
                            bVar2 = (ke.b) bVar2.f;
                        }
                    }
                    return kVar;
                }
                this.d = i10;
                z4 = false;
                if (!z4) {
                }
                if (!z4) {
                }
            }
        } else {
            str = null;
        }
        str2 = null;
        z4 = false;
        if (!z4) {
        }
        if (!z4) {
        }
    }

    @Override // qc.h
    public final char d() {
        return ']';
    }
}
