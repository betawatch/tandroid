// default package

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.zip.Inflater;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class tkc implements vcb {
    public static final i53 e;
    public final yw7 a = new yw7();
    public final yw7 b = new yw7();
    public final skc c;
    public Inflater d;

    static {
        ko5 ko5Var = mo5.b;
        e = new i53(-9223372036854775807L, -9223372036854775807L, y79.e);
    }

    public tkc(List list) {
        int i;
        skc skcVar = new skc();
        this.c = skcVar;
        String trim = new String((byte[]) list.get(0), StandardCharsets.UTF_8).trim();
        String str = hac.a;
        for (String str2 : trim.split("\\r?\\n", -1)) {
            if (str2.startsWith("palette: ")) {
                String[] split = str2.substring(9).split(",", -1);
                skcVar.f = new int[split.length];
                for (int i2 = 0; i2 < split.length; i2++) {
                    int[] iArr = skcVar.f;
                    try {
                        i = Integer.parseInt(split[i2].trim(), 16);
                    } catch (RuntimeException e2) {
                        ncd.g("VobsubParser", "Parsing color failed", e2);
                        i = 0;
                    }
                    iArr[i2] = i;
                }
            } else if (str2.startsWith("size: ")) {
                String[] split2 = str2.substring(6).trim().split("x", -1);
                if (split2.length != 2) {
                    ncd.f("VobsubParser", "Ignoring malformed IDX size line: '" + str2 + "'");
                } else {
                    try {
                        skcVar.g = Integer.parseInt(split2[0]);
                        skcVar.h = Integer.parseInt(split2[1]);
                        skcVar.d = true;
                    } catch (RuntimeException e3) {
                        ncd.g("VobsubParser", "Parsing IDX failed", e3);
                    }
                }
            }
        }
    }

    @Override // vcb
    public final /* synthetic */ lcb g(int i, int i2, byte[] bArr) {
        return hg9.c(this, bArr, i2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:76:0x00b7. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0276  */
    @Override // vcb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(byte[] bArr, int i, int i2, ucb ucbVar, fu2 fu2Var) {
        i53 i53Var;
        boolean z;
        long j;
        boolean z2;
        boolean z3;
        f53 f53Var;
        long j2;
        long j3;
        y79 y79Var;
        Rect rect;
        yw7 yw7Var = this.a;
        yw7Var.L(i + i2, bArr);
        yw7Var.N(i);
        Inflater inflater = this.d;
        if (inflater == null) {
            inflater = new Inflater();
            this.d = inflater;
        }
        yw7 yw7Var2 = this.b;
        if (hac.R(yw7Var, yw7Var2, inflater)) {
            yw7Var.L(yw7Var2.c, yw7Var2.a);
        }
        skc skcVar = this.c;
        long j4 = -9223372036854775807L;
        skcVar.b = -9223372036854775807L;
        skcVar.c = -9223372036854775807L;
        boolean z4 = false;
        skcVar.e = false;
        skcVar.i = null;
        skcVar.j = -1;
        skcVar.k = -1;
        int a = yw7Var.a();
        if (a < 2 || yw7Var.H() != a) {
            i53Var = e;
        } else {
            if (skcVar.f == null) {
                ncd.f("VobsubParser", "Skipping SPU (no palette)");
            } else if (skcVar.d) {
                int i3 = yw7Var.b - 2;
                yw7Var.N(yw7Var.H() + i3);
                while (true) {
                    if (yw7Var.a() < 4) {
                        j = j4;
                        z2 = z4;
                        z = z2;
                    } else {
                        int i4 = yw7Var.b;
                        int H = yw7Var.H() * 10000;
                        int H2 = yw7Var.H() + i3;
                        z = (H2 == i4 || H2 >= yw7Var.c) ? z4 : true;
                        int i5 = z ? H2 : yw7Var.c;
                        j = j4;
                        boolean z5 = true;
                        while (yw7Var.b < i5 && z5) {
                            long j5 = H;
                            int[] iArr = skcVar.a;
                            boolean z6 = z4;
                            int A = yw7Var.A();
                            if (A != 255) {
                                switch (A) {
                                    case 0:
                                        z3 = true;
                                        break;
                                    case 1:
                                        skcVar.b = j5;
                                        z3 = true;
                                        break;
                                    case 2:
                                        skcVar.c = j5;
                                        z3 = true;
                                        break;
                                    case 3:
                                        if (yw7Var.a() >= 2) {
                                            int A2 = yw7Var.A();
                                            int A3 = yw7Var.A();
                                            iArr[3] = skc.a(skcVar.f, A2 >> 4);
                                            iArr[2] = skc.a(skcVar.f, A2 & 15);
                                            iArr[1] = skc.a(skcVar.f, A3 >> 4);
                                            iArr[z6 ? 1 : 0] = skc.a(skcVar.f, A3 & 15);
                                            skcVar.e = true;
                                            z3 = true;
                                            break;
                                        } else {
                                            ncd.f("VobsubParser", "Incomplete color command");
                                            break;
                                        }
                                    case 4:
                                        if (yw7Var.a() >= 2) {
                                            if (!skcVar.e) {
                                                ncd.f("VobsubParser", "Ignoring alpha command before color command");
                                                break;
                                            } else {
                                                int A4 = yw7Var.A();
                                                int A5 = yw7Var.A();
                                                iArr[3] = skc.c(iArr[3], A4 >> 4);
                                                iArr[2] = skc.c(iArr[2], A4 & 15);
                                                iArr[1] = skc.c(iArr[1], A5 >> 4);
                                                iArr[z6 ? 1 : 0] = skc.c(iArr[z6 ? 1 : 0], A5 & 15);
                                                z3 = true;
                                                break;
                                            }
                                        } else {
                                            ncd.f("VobsubParser", "Incomplete alpha command");
                                            break;
                                        }
                                    case 5:
                                        if (yw7Var.a() >= 6) {
                                            int A6 = yw7Var.A();
                                            int A7 = yw7Var.A();
                                            int i6 = (A6 << 4) | (A7 >> 4);
                                            int A8 = ((A7 & 15) << 8) | yw7Var.A();
                                            int A9 = yw7Var.A();
                                            int A10 = yw7Var.A();
                                            skcVar.i = new Rect(i6, (A9 << 4) | (A10 >> 4), A8 + 1, (((A10 & 15) << 8) | yw7Var.A()) + 1);
                                            z3 = true;
                                            break;
                                        } else {
                                            ncd.f("VobsubParser", "Incomplete area command");
                                            break;
                                        }
                                    case 6:
                                        if (yw7Var.a() >= 4) {
                                            skcVar.j = yw7Var.H();
                                            skcVar.k = yw7Var.H();
                                            z3 = true;
                                            break;
                                        } else {
                                            ncd.f("VobsubParser", "Incomplete offsets command");
                                            break;
                                        }
                                    default:
                                        b10.o(A, "Unrecognized command: ", "VobsubParser");
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
                            yw7Var.N(H2);
                        }
                    }
                    if (z) {
                        j4 = j;
                        z4 = z2;
                    } else {
                        if (skcVar.f != null || !skcVar.d || !skcVar.e || (rect = skcVar.i) == null || skcVar.j == -1 || skcVar.k == -1 || rect.width() < 2 || skcVar.i.height() < 2) {
                            f53Var = null;
                        } else {
                            Rect rect2 = skcVar.i;
                            int[] iArr2 = new int[rect2.height() * rect2.width()];
                            ye1 ye1Var = new ye1();
                            yw7Var.N(skcVar.j);
                            ye1Var.k(yw7Var);
                            skcVar.b(ye1Var, true, rect2, iArr2);
                            yw7Var.N(skcVar.k);
                            ye1Var.k(yw7Var);
                            skcVar.b(ye1Var, z2, rect2, iArr2);
                            f53Var = new f53(null, null, null, Bitmap.createBitmap(iArr2, rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888), rect2.top / skcVar.h, 0, 0, rect2.left / skcVar.g, 0, TLObject.FLAG_31, -3.4028235E38f, rect2.width() / skcVar.g, rect2.height() / skcVar.h, false, -16777216, TLObject.FLAG_31, 0.0f, 0);
                        }
                        j2 = skcVar.c;
                        if (j2 == j) {
                            long j6 = skcVar.b;
                            if (j6 != j && j2 > j6) {
                                j2 -= j6;
                            }
                            j3 = j2;
                        } else {
                            j3 = j;
                        }
                        if (f53Var == null) {
                            y79Var = mo5.u(f53Var);
                        } else {
                            ko5 ko5Var = mo5.b;
                            y79Var = y79.e;
                        }
                        i53Var = new i53(skcVar.b, j3, y79Var);
                    }
                }
            } else {
                ncd.f("VobsubParser", "Skipping SPU (no plane)");
            }
            j = -9223372036854775807L;
            z2 = false;
            if (skcVar.f != null) {
            }
            f53Var = null;
            j2 = skcVar.c;
            if (j2 == j) {
            }
            if (f53Var == null) {
            }
            i53Var = new i53(skcVar.b, j3, y79Var);
        }
        fu2Var.accept(i53Var);
    }

    @Override // vcb
    public final int r() {
        return 2;
    }

    @Override // vcb
    public final void reset() {
    }
}
