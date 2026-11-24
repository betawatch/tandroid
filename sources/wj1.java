// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class wj1 implements bg8 {
    public static wj1 a(String str) {
        int length = str.length();
        if (length != 0) {
            return length != 1 ? length != 2 ? new rj1(str) : new uj1(str.charAt(0), str.charAt(1)) : new tj1(str.charAt(0), (byte) 0);
        }
        return qj1.f;
    }

    public static String d(char c) {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
            c = (char) (c >> 4);
        }
        return String.copyValueOf(cArr);
    }

    @Override // bg8
    public final boolean apply(Object obj) {
        return b(((Character) obj).charValue());
    }

    public abstract boolean b(char c);

    public wj1 c() {
        return new rj1(this);
    }
}
