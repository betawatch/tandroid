package q3;

import a8.ed;
import a8.yb;
import b2.r0;
import e2.n0;
import f9.i0;
import f9.s1;
import j$.util.Objects;
import java.util.ArrayList;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class n extends i {
    public final String b;
    public final i0 c;

    public n(String str, String str2, s1 s1Var) {
        super(str);
        yb.g(!s1Var.isEmpty());
        this.b = str2;
        i0 u10 = i0.u(s1Var);
        this.c = u10;
    }

    public static ArrayList d(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // q3.i, b2.t0
    public final void b(r0 r0Var) {
        char c10;
        String str = this.a;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c10 = '\b';
                    break;
                }
                c10 = 65535;
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c10 = '\t';
                    break;
                }
                c10 = 65535;
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c10 = '\n';
                    break;
                }
                c10 = 65535;
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c10 = 11;
                    break;
                }
                c10 = 65535;
                break;
            case 2569358:
                if (str.equals("TCON")) {
                    c10 = '\f';
                    break;
                }
                c10 = 65535;
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c10 = '\r';
                    break;
                }
                c10 = 65535;
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c10 = 14;
                    break;
                }
                c10 = 65535;
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c10 = 15;
                    break;
                }
                c10 = 65535;
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c10 = 16;
                    break;
                }
                c10 = 65535;
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c10 = 17;
                    break;
                }
                c10 = 65535;
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c10 = 18;
                    break;
                }
                c10 = 65535;
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c10 = 19;
                    break;
                }
                c10 = 65535;
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c10 = 20;
                    break;
                }
                c10 = 65535;
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c10 = 21;
                    break;
                }
                c10 = 65535;
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c10 = 22;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        i0 i0Var = this.c;
        try {
            switch (c10) {
                case 0:
                case '\n':
                    r0Var.c = (CharSequence) i0Var.get(0);
                    break;
                case 1:
                case 11:
                    r0Var.A = (CharSequence) i0Var.get(0);
                    break;
                case 2:
                case '\r':
                    String str2 = (String) i0Var.get(0);
                    int parseInt = Integer.parseInt(str2.substring(2, 4));
                    int parseInt2 = Integer.parseInt(str2.substring(0, 2));
                    r0Var.u = Integer.valueOf(parseInt);
                    r0Var.v = Integer.valueOf(parseInt2);
                    break;
                case 3:
                case 18:
                    r0Var.b = (CharSequence) i0Var.get(0);
                    break;
                case 4:
                case 19:
                    r0Var.d = (CharSequence) i0Var.get(0);
                    break;
                case 5:
                case 20:
                    r0Var.B = (CharSequence) i0Var.get(0);
                    break;
                case 6:
                case 21:
                    String str3 = (String) i0Var.get(0);
                    String str4 = n0.a;
                    String[] split = str3.split("/", -1);
                    int parseInt3 = Integer.parseInt(split[0]);
                    Integer valueOf = split.length > 1 ? Integer.valueOf(Integer.parseInt(split[1])) : null;
                    r0Var.o = Integer.valueOf(parseInt3);
                    r0Var.p = valueOf;
                    break;
                case 7:
                case 17:
                    r0Var.a = (CharSequence) i0Var.get(0);
                    break;
                case '\b':
                case 16:
                    r0Var.z = (CharSequence) i0Var.get(0);
                    break;
                case '\t':
                case 22:
                    r0Var.t = Integer.valueOf(Integer.parseInt((String) i0Var.get(0)));
                    break;
                case '\f':
                    Integer g7 = ed.g((String) i0Var.get(0));
                    if (g7 != null) {
                        String a2 = j.a(g7.intValue());
                        if (a2 != null) {
                            r0Var.E = a2;
                            break;
                        }
                    } else {
                        r0Var.E = (CharSequence) i0Var.get(0);
                        break;
                    }
                    break;
                case 14:
                    ArrayList d = d((String) i0Var.get(0));
                    int size = d.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                r0Var.v = (Integer) d.get(2);
                            }
                        }
                        r0Var.u = (Integer) d.get(1);
                    }
                    r0Var.t = (Integer) d.get(0);
                    break;
                case 15:
                    ArrayList d10 = d((String) i0Var.get(0));
                    int size2 = d10.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                r0Var.y = (Integer) d10.get(2);
                            }
                        }
                        r0Var.x = (Integer) d10.get(1);
                    }
                    r0Var.w = (Integer) d10.get(0);
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            if (Objects.equals(this.a, nVar.a) && Objects.equals(this.b, nVar.b) && this.c.equals(nVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int f7 = a1.g.f(527, 31, this.a);
        String str = this.b;
        return this.c.hashCode() + ((f7 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // q3.i
    public final String toString() {
        return this.a + ": description=" + this.b + ": values=" + this.c;
    }
}
