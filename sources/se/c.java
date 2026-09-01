package se;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class c {
    public int a;
    public int b;
    public int c;
    public int d;
    public String e;

    public final String a(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(20);
        boolean z4 = false;
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        for (int i11 = 0; i11 < this.e.length(); i11++) {
            char charAt = this.e.charAt(i11);
            if (charAt != '#') {
                if (charAt != '(') {
                    if (charAt == 'c') {
                        if (str2 != null) {
                            sb.append(str2);
                        }
                        z4 = true;
                    } else if (charAt == 'n') {
                        if (str3 != null) {
                            sb.append(str3);
                        }
                        z10 = true;
                    }
                } else if (i10 < str.length()) {
                    z11 = true;
                }
                if (charAt == ' ' && i11 > 0) {
                    int i12 = i11 - 1;
                    if (this.e.charAt(i12) == 'n') {
                        if (str3 == null) {
                        }
                    }
                    if (this.e.charAt(i12) == 'c' && str2 == null) {
                    }
                }
                if (i10 < str.length() || (z11 && charAt == ')')) {
                    sb.append(this.e.substring(i11, i11 + 1));
                    if (charAt == ')') {
                        z11 = false;
                    }
                }
            } else if (i10 < str.length()) {
                int i13 = i10 + 1;
                sb.append(str.substring(i10, i13));
                i10 = i13;
            } else if (z11) {
                sb.append(" ");
            }
        }
        if (str2 != null && !z4) {
            sb.insert(0, str2.concat(" "));
        } else if (str3 != null && !z10) {
            sb.insert(0, str3);
        }
        return sb.toString();
    }
}
