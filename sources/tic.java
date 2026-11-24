// default package

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.zip.Inflater;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class tic implements uab {
    public static final x33 e;
    public final xu7 a = new xu7();
    public final xu7 b = new xu7();
    public final sic c;
    public Inflater d;

    static {
        km5 km5Var = mm5.b;
        e = new x33(-9223372036854775807L, -9223372036854775807L, w59.e);
    }

    public tic(List list) {
        int i;
        sic sicVar = new sic();
        this.c = sicVar;
        String trim = new String((byte[]) list.get(0), StandardCharsets.UTF_8).trim();
        String str = g8c.a;
        for (String str2 : trim.split("\\r?\\n", -1)) {
            if (str2.startsWith("palette: ")) {
                String[] split = str2.substring(9).split(",", -1);
                sicVar.f = new int[split.length];
                for (int i2 = 0; i2 < split.length; i2++) {
                    int[] iArr = sicVar.f;
                    try {
                        i = Integer.parseInt(split[i2].trim(), 16);
                    } catch (RuntimeException e2) {
                        lad.g("VobsubParser", "Parsing color failed", e2);
                        i = 0;
                    }
                    iArr[i2] = i;
                }
            } else if (str2.startsWith("size: ")) {
                String[] split2 = str2.substring(6).trim().split("x", -1);
                if (split2.length != 2) {
                    lad.f("VobsubParser", "Ignoring malformed IDX size line: '" + str2 + "'");
                } else {
                    try {
                        sicVar.g = Integer.parseInt(split2[0]);
                        sicVar.h = Integer.parseInt(split2[1]);
                        sicVar.d = true;
                    } catch (RuntimeException e3) {
                        lad.g("VobsubParser", "Parsing IDX failed", e3);
                    }
                }
            }
        }
    }

    @Override // uab
    public final /* synthetic */ kab f(int i, int i2, byte[] bArr) {
        return de9.c(this, bArr, i2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:76:0x00b7. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0276  */
    @Override // uab
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(byte[] bArr, int i, int i2, tab tabVar, us2 us2Var) {
        x33 x33Var;
        boolean z;
        long j;
        boolean z2;
        boolean z3;
        u33 u33Var;
        long j2;
        long j3;
        w59 w59Var;
        Rect rect;
        xu7 xu7Var = this.a;
        xu7Var.L(i + i2, bArr);
        xu7Var.N(i);
        Inflater inflater = this.d;
        if (inflater == null) {
            inflater = new Inflater();
            this.d = inflater;
        }
        xu7 xu7Var2 = this.b;
        if (g8c.R(xu7Var, xu7Var2, inflater)) {
            xu7Var.L(xu7Var2.c, xu7Var2.a);
        }
        sic sicVar = this.c;
        long j4 = -9223372036854775807L;
        sicVar.b = -9223372036854775807L;
        sicVar.c = -9223372036854775807L;
        boolean z4 = false;
        sicVar.e = false;
        sicVar.i = null;
        sicVar.j = -1;
        sicVar.k = -1;
        int a = xu7Var.a();
        if (a < 2 || xu7Var.H() != a) {
            x33Var = e;
        } else {
            if (sicVar.f == null) {
                lad.f("VobsubParser", "Skipping SPU (no palette)");
            } else if (sicVar.d) {
                int i3 = xu7Var.b - 2;
                xu7Var.N(xu7Var.H() + i3);
                while (true) {
                    if (xu7Var.a() < 4) {
                        j = j4;
                        z2 = z4;
                        z = z2;
                    } else {
                        int i4 = xu7Var.b;
                        int H = xu7Var.H() * 10000;
                        int H2 = xu7Var.H() + i3;
                        z = (H2 == i4 || H2 >= xu7Var.c) ? z4 : true;
                        int i5 = z ? H2 : xu7Var.c;
                        j = j4;
                        boolean z5 = true;
                        while (xu7Var.b < i5 && z5) {
                            long j5 = H;
                            int[] iArr = sicVar.a;
                            boolean z6 = z4;
                            int A = xu7Var.A();
                            if (A != 255) {
                                switch (A) {
                                    case 0:
                                        z3 = true;
                                        break;
                                    case 1:
                                        sicVar.b = j5;
                                        z3 = true;
                                        break;
                                    case 2:
                                        sicVar.c = j5;
                                        z3 = true;
                                        break;
                                    case 3:
                                        if (xu7Var.a() >= 2) {
                                            int A2 = xu7Var.A();
                                            int A3 = xu7Var.A();
                                            iArr[3] = sic.a(sicVar.f, A2 >> 4);
                                            iArr[2] = sic.a(sicVar.f, A2 & 15);
                                            iArr[1] = sic.a(sicVar.f, A3 >> 4);
                                            iArr[z6 ? 1 : 0] = sic.a(sicVar.f, A3 & 15);
                                            sicVar.e = true;
                                            z3 = true;
                                            break;
                                        } else {
                                            lad.f("VobsubParser", "Incomplete color command");
                                            break;
                                        }
                                    case 4:
                                        if (xu7Var.a() >= 2) {
                                            if (!sicVar.e) {
                                                lad.f("VobsubParser", "Ignoring alpha command before color command");
                                                break;
                                            } else {
                                                int A4 = xu7Var.A();
                                                int A5 = xu7Var.A();
                                                iArr[3] = sic.c(iArr[3], A4 >> 4);
                                                iArr[2] = sic.c(iArr[2], A4 & 15);
                                                iArr[1] = sic.c(iArr[1], A5 >> 4);
                                                iArr[z6 ? 1 : 0] = sic.c(iArr[z6 ? 1 : 0], A5 & 15);
                                                z3 = true;
                                                break;
                                            }
                                        } else {
                                            lad.f("VobsubParser", "Incomplete alpha command");
                                            break;
                                        }
                                    case 5:
                                        if (xu7Var.a() >= 6) {
                                            int A6 = xu7Var.A();
                                            int A7 = xu7Var.A();
                                            int i6 = (A6 << 4) | (A7 >> 4);
                                            int A8 = ((A7 & 15) << 8) | xu7Var.A();
                                            int A9 = xu7Var.A();
                                            int A10 = xu7Var.A();
                                            sicVar.i = new Rect(i6, (A9 << 4) | (A10 >> 4), A8 + 1, (((A10 & 15) << 8) | xu7Var.A()) + 1);
                                            z3 = true;
                                            break;
                                        } else {
                                            lad.f("VobsubParser", "Incomplete area command");
                                            break;
                                        }
                                    case 6:
                                        if (xu7Var.a() >= 4) {
                                            sicVar.j = xu7Var.H();
                                            sicVar.k = xu7Var.H();
                                            z3 = true;
                                            break;
                                        } else {
                                            lad.f("VobsubParser", "Incomplete offsets command");
                                            break;
                                        }
                                    default:
                                        b00.o(A, "Unrecognized command: ", "VobsubParser");
                                        break;
                                }
                                z4 = z6 ? 1 : 0;
                                z5 = z3;
                            }
                            z3 = z6 ? 1 : 0;
                            z4 = z6 ? 1 : 0;
                            z5 = z3;
                        }
                        z2 = z4;
                        if (z) {
                            xu7Var.N(H2);
                        }
                    }
                    if (z) {
                        j4 = j;
                        z4 = z2;
                    } else {
                        if (sicVar.f != null || !sicVar.d || !sicVar.e || (rect = sicVar.i) == null || sicVar.j == -1 || sicVar.k == -1 || rect.width() < 2 || sicVar.i.height() < 2) {
                            u33Var = null;
                        } else {
                            Rect rect2 = sicVar.i;
                            int[] iArr2 = new int[rect2.height() * rect2.width()];
                            qd1 qd1Var = new qd1();
                            xu7Var.N(sicVar.j);
                            qd1Var.k(xu7Var);
                            sicVar.b(qd1Var, true, rect2, iArr2);
                            xu7Var.N(sicVar.k);
                            qd1Var.k(xu7Var);
                            sicVar.b(qd1Var, z2, rect2, iArr2);
                            u33Var = new u33(null, null, null, Bitmap.createBitmap(iArr2, rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888), rect2.top / sicVar.h, 0, 0, rect2.left / sicVar.g, 0, TLObject.FLAG_31, -3.4028235E38f, rect2.width() / sicVar.g, rect2.height() / sicVar.h, false, -16777216, TLObject.FLAG_31, 0.0f, 0);
                        }
                        j2 = sicVar.c;
                        if (j2 == j) {
                            long j6 = sicVar.b;
                            if (j6 != j && j2 > j6) {
                                j2 -= j6;
                            }
                            j3 = j2;
                        } else {
                            j3 = j;
                        }
                        if (u33Var == null) {
                            w59Var = mm5.u(u33Var);
                        } else {
                            km5 km5Var = mm5.b;
                            w59Var = w59.e;
                        }
                        x33Var = new x33(sicVar.b, j3, w59Var);
                    }
                }
            } else {
                lad.f("VobsubParser", "Skipping SPU (no plane)");
            }
            j = -9223372036854775807L;
            z2 = false;
            if (sicVar.f != null) {
            }
            u33Var = null;
            j2 = sicVar.c;
            if (j2 == j) {
            }
            if (u33Var == null) {
            }
            x33Var = new x33(sicVar.b, j3, w59Var);
        }
        us2Var.accept(x33Var);
    }

    @Override // uab
    public final int o() {
        return 2;
    }

    @Override // uab
    public final void reset() {
    }
}
