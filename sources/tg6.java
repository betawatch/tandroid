// default package

import java.io.DataInputStream;
import java.io.EOFException;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class tg6 {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public tg6(a51 a51Var, tg6 tg6Var, String str) {
        this.a = (byte) 0;
        this.b = a51Var;
        this.c = tg6Var;
        this.d = str;
        this.e = new DataInputStream(a51Var);
    }

    public void a(ild ildVar) {
        ildVar.v(this);
    }

    public final void b(tg6 tg6Var) {
        tg6Var.g();
        tg6Var.e(this);
        tg6 tg6Var2 = (tg6) this.d;
        if (tg6Var2 == null) {
            this.c = tg6Var;
            this.d = tg6Var;
        } else {
            tg6Var2.f = tg6Var;
            tg6Var.e = tg6Var2;
            this.d = tg6Var;
        }
    }

    public final sg6 c() {
        a51 a51Var = (a51) this.b;
        DataInputStream dataInputStream = (DataInputStream) this.e;
        sg6 sg6Var = (sg6) this.f;
        if (sg6Var != null) {
            while (sg6Var.i() > 0) {
                if (((zy8) ((a51) sg6Var.b)).skip(sg6Var.i()) == 0) {
                    throw new EOFException("Cannot skip atom");
                }
            }
        }
        int readInt = dataInputStream.readInt();
        byte[] bArr = new byte[4];
        dataInputStream.readFully(bArr);
        sg6 sg6Var2 = new sg6(readInt == 1 ? new zy8(a51Var, 16L, dataInputStream.readLong() - 16) : new zy8(a51Var, 8L, readInt - 8), this, new String(bArr, "ISO8859_1"), (byte) 0);
        this.f = sg6Var2;
        return sg6Var2;
    }

    public final sg6 d(String str) {
        sg6 c = c();
        String str2 = (String) c.d;
        if (str2.matches(str)) {
            return c;
        }
        k93.f(tb4.q("atom type mismatch, expected ", str, ", got ", str2));
        return null;
    }

    public void e(tg6 tg6Var) {
        this.b = tg6Var;
    }

    public String f() {
        return "";
    }

    public final void g() {
        tg6 tg6Var = (tg6) this.e;
        if (tg6Var != null) {
            tg6Var.f = (tg6) this.f;
        } else {
            tg6 tg6Var2 = (tg6) this.b;
            if (tg6Var2 != null) {
                tg6Var2.c = (tg6) this.f;
            }
        }
        tg6 tg6Var3 = (tg6) this.f;
        if (tg6Var3 != null) {
            tg6Var3.e = tg6Var;
        } else {
            tg6 tg6Var4 = (tg6) this.b;
            if (tg6Var4 != null) {
                tg6Var4.d = tg6Var;
            }
        }
        this.b = null;
        this.f = null;
        this.e = null;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return getClass().getSimpleName() + "{" + f() + "}";
            default:
                return super.toString();
        }
    }

    public tg6() {
        this.a = (byte) 1;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
    }
}
