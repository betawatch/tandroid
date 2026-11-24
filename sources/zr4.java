// default package

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class zr4 {
    public static final Pattern c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int a = -1;
    public int b = -1;

    public final boolean a(String str) {
        Matcher matcher = c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String group = matcher.group(1);
            String str2 = g8c.a;
            int parseInt = Integer.parseInt(group, 16);
            int parseInt2 = Integer.parseInt(matcher.group(2), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.a = parseInt;
            this.b = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x007e, code lost:
    
        if (r0.apply(r6) == false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(ld7 ld7Var) {
        jd7 jd7Var;
        ld7Var.getClass();
        jm5 p = mm5.p();
        jd7[] jd7VarArr = ld7Var.a;
        int length = jd7VarArr.length;
        int i = 0;
        while (true) {
            jd7 jd7Var2 = null;
            if (i >= length) {
                break;
            }
            jd7 jd7Var3 = jd7VarArr[i];
            if (km2.class.isAssignableFrom(jd7Var3.getClass())) {
                jd7 jd7Var4 = (jd7) km2.class.cast(jd7Var3);
                if (((km2) jd7Var4).c.equals("iTunSMPB")) {
                    jd7Var2 = jd7Var4;
                }
            }
            if (jd7Var2 != null) {
                p.c(jd7Var2);
            }
            i++;
        }
        km5 listIterator = p.f().listIterator(0);
        while (listIterator.hasNext()) {
            if (a(((km2) listIterator.next()).d)) {
                return;
            }
        }
        ua3 ua3Var = new ua3((byte) 2);
        jm5 p2 = mm5.p();
        for (jd7 jd7Var5 : ld7Var.a) {
            if (np5.class.isAssignableFrom(jd7Var5.getClass())) {
                jd7Var = (jd7) np5.class.cast(jd7Var5);
            }
            jd7Var = null;
            if (jd7Var != null) {
                p2.c(jd7Var);
            }
        }
        km5 listIterator2 = p2.f().listIterator(0);
        while (listIterator2.hasNext() && !a(((np5) listIterator2.next()).d)) {
        }
    }
}
