package s4;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import androidx.car.app.navigation.model.Maneuver;
import d5.x;
import d5.y;
import j$.util.DesugarCollections;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class f extends i {
    public final y g = new y();
    public final x h = new x();
    public int i = -1;
    public final int j;
    public final e[] k;
    public e l;
    public List m;
    public List n;
    public x o;
    public int p;

    public f(int i9, List list) {
        this.j = i9 == -1 ? 1 : i9;
        if (list != null && list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
            byte b10 = ((byte[]) list.get(0))[0];
        }
        this.k = new e[8];
        for (int i10 = 0; i10 < 8; i10++) {
            this.k[i10] = new e();
        }
        this.l = this.k[0];
    }

    @Override // s4.i
    public final j b() {
        List list = this.m;
        this.n = list;
        list.getClass();
        return new j(0, list);
    }

    @Override // s4.i
    public final void c(g gVar) {
        ByteBuffer byteBuffer = gVar.b;
        byteBuffer.getClass();
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        y yVar = this.g;
        yVar.A(limit, array);
        while (yVar.a() >= 3) {
            int r10 = yVar.r();
            int i9 = r10 & 3;
            boolean z10 = (r10 & 4) == 4;
            byte r11 = (byte) yVar.r();
            byte r12 = (byte) yVar.r();
            if (i9 == 2 || i9 == 3) {
                if (z10) {
                    if (i9 == 3) {
                        f();
                        int i10 = (r11 & 192) >> 6;
                        int i11 = this.i;
                        if (i11 != -1 && i10 != (i11 + 1) % 4) {
                            h();
                            d5.a.K("Cea708Decoder", "Sequence number discontinuity. previous=" + this.i + " current=" + i10);
                        }
                        this.i = i10;
                        int i12 = r11 & 63;
                        if (i12 == 0) {
                            i12 = 64;
                        }
                        x xVar = new x(i10, i12);
                        this.o = xVar;
                        byte[] bArr = xVar.b;
                        xVar.e = 1;
                        bArr[0] = r12;
                    } else {
                        d5.a.f(i9 == 2);
                        x xVar2 = this.o;
                        if (xVar2 == null) {
                            d5.a.o("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = xVar2.b;
                            int i13 = xVar2.e;
                            int i14 = i13 + 1;
                            xVar2.e = i14;
                            bArr2[i13] = r11;
                            xVar2.e = i13 + 2;
                            bArr2[i14] = r12;
                        }
                    }
                    x xVar3 = this.o;
                    if (xVar3.e == (xVar3.d * 2) - 1) {
                        f();
                    }
                }
            }
        }
    }

    @Override // s4.i
    public final boolean e() {
        return this.m != this.n;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void f() {
        int i9;
        x xVar = this.o;
        if (xVar == null) {
            return;
        }
        int i10 = 2;
        if (xVar.e != (xVar.d * 2) - 1) {
            d5.a.n("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.o.d * 2) - 1) + ", but current index is " + this.o.e + " (sequence number " + this.o.c + ");");
        }
        x xVar2 = this.o;
        byte[] bArr = xVar2.b;
        int i11 = xVar2.e;
        x xVar3 = this.h;
        xVar3.n(i11, bArr);
        boolean z10 = false;
        while (true) {
            if (xVar3.b() > 0) {
                int i12 = 3;
                int i13 = xVar3.i(3);
                int i14 = xVar3.i(5);
                if (i13 == 7) {
                    xVar3.s(i10);
                    i13 = xVar3.i(6);
                    if (i13 < 7) {
                        e2.c.t(i13, "Invalid extended service number: ", "Cea708Decoder");
                    }
                }
                if (i14 == 0) {
                    if (i13 != 0) {
                        d5.a.K("Cea708Decoder", "serviceNumber is non-zero (" + i13 + ") when blockSize is 0");
                    }
                } else if (i13 != this.j) {
                    xVar3.t(i14);
                } else {
                    int g10 = (i14 * 8) + xVar3.g();
                    while (xVar3.g() < g10) {
                        int i15 = xVar3.i(8);
                        if (i15 == 16) {
                            i9 = g10;
                            int i16 = xVar3.i(8);
                            if (i16 <= 31) {
                                if (i16 > 7) {
                                    if (i16 <= 15) {
                                        xVar3.s(8);
                                    } else if (i16 <= 23) {
                                        xVar3.s(16);
                                    } else if (i16 <= 31) {
                                        xVar3.s(24);
                                    }
                                }
                            } else if (i16 <= 127) {
                                if (i16 == 32) {
                                    this.l.a(' ');
                                } else if (i16 == 33) {
                                    this.l.a((char) 160);
                                } else if (i16 == 37) {
                                    this.l.a((char) 8230);
                                } else if (i16 == 42) {
                                    this.l.a((char) 352);
                                } else if (i16 == 44) {
                                    this.l.a((char) 338);
                                } else if (i16 == 63) {
                                    this.l.a((char) 376);
                                } else if (i16 == 57) {
                                    this.l.a((char) 8482);
                                } else if (i16 == 58) {
                                    this.l.a((char) 353);
                                } else if (i16 == 60) {
                                    this.l.a((char) 339);
                                } else if (i16 != 61) {
                                    switch (i16) {
                                        case 48:
                                            this.l.a((char) 9608);
                                            break;
                                        case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                                            this.l.a((char) 8216);
                                            break;
                                        case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                                            this.l.a((char) 8217);
                                            break;
                                        case 51:
                                            this.l.a((char) 8220);
                                            break;
                                        case 52:
                                            this.l.a((char) 8221);
                                            break;
                                        case 53:
                                            this.l.a((char) 8226);
                                            break;
                                        default:
                                            switch (i16) {
                                                case 118:
                                                    this.l.a((char) 8539);
                                                    break;
                                                case 119:
                                                    this.l.a((char) 8540);
                                                    break;
                                                case 120:
                                                    this.l.a((char) 8541);
                                                    break;
                                                case 121:
                                                    this.l.a((char) 8542);
                                                    break;
                                                case 122:
                                                    this.l.a((char) 9474);
                                                    break;
                                                case 123:
                                                    this.l.a((char) 9488);
                                                    break;
                                                case 124:
                                                    this.l.a((char) 9492);
                                                    break;
                                                case 125:
                                                    this.l.a((char) 9472);
                                                    break;
                                                case 126:
                                                    this.l.a((char) 9496);
                                                    break;
                                                case 127:
                                                    this.l.a((char) 9484);
                                                    break;
                                                default:
                                                    e2.c.t(i16, "Invalid G2 character: ", "Cea708Decoder");
                                                    break;
                                            }
                                    }
                                } else {
                                    this.l.a((char) 8480);
                                }
                                z10 = true;
                            } else if (i16 <= 159) {
                                if (i16 <= 135) {
                                    xVar3.s(32);
                                } else if (i16 <= 143) {
                                    xVar3.s(40);
                                } else if (i16 <= 159) {
                                    xVar3.s(2);
                                    xVar3.s(xVar3.i(6) * 8);
                                }
                            } else if (i16 <= 255) {
                                if (i16 == 160) {
                                    this.l.a((char) 13252);
                                } else {
                                    e2.c.t(i16, "Invalid G3 character: ", "Cea708Decoder");
                                    this.l.a('_');
                                }
                                z10 = true;
                            } else {
                                e2.c.t(i16, "Invalid extended command: ", "Cea708Decoder");
                            }
                        } else if (i15 <= 31) {
                            if (i15 != 0) {
                                if (i15 == i12) {
                                    this.m = g();
                                } else if (i15 != 8) {
                                    switch (i15) {
                                        case 12:
                                            h();
                                            break;
                                        case 13:
                                            this.l.a('\n');
                                            break;
                                        case 14:
                                            break;
                                        default:
                                            if (i15 < 17 || i15 > 23) {
                                                if (i15 < 24 || i15 > 31) {
                                                    e2.c.t(i15, "Invalid C0 command: ", "Cea708Decoder");
                                                    break;
                                                } else {
                                                    d5.a.K("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i15);
                                                    xVar3.s(16);
                                                    break;
                                                }
                                            } else {
                                                d5.a.K("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i15);
                                                xVar3.s(8);
                                                break;
                                            }
                                    }
                                } else {
                                    SpannableStringBuilder spannableStringBuilder = this.l.b;
                                    int length = spannableStringBuilder.length();
                                    if (length > 0) {
                                        spannableStringBuilder.delete(length - 1, length);
                                    }
                                }
                            }
                            i9 = g10;
                        } else if (i15 <= 127) {
                            if (i15 == 127) {
                                this.l.a((char) 9835);
                            } else {
                                this.l.a((char) (i15 & 255));
                            }
                            i9 = g10;
                            z10 = true;
                        } else {
                            if (i15 <= 159) {
                                e[] eVarArr = this.k;
                                switch (i15) {
                                    case 128:
                                    case 129:
                                    case 130:
                                    case 131:
                                    case 132:
                                    case 133:
                                    case 134:
                                    case 135:
                                        i9 = g10;
                                        int i17 = i15 - 128;
                                        if (this.p != i17) {
                                            this.p = i17;
                                            this.l = eVarArr[i17];
                                            break;
                                        }
                                        break;
                                    case 136:
                                        i9 = g10;
                                        for (int i18 = 1; i18 <= 8; i18++) {
                                            if (xVar3.h()) {
                                                e eVar = eVarArr[8 - i18];
                                                eVar.a.clear();
                                                eVar.b.clear();
                                                eVar.p = -1;
                                                eVar.q = -1;
                                                eVar.r = -1;
                                                eVar.t = -1;
                                                eVar.v = 0;
                                            }
                                        }
                                        break;
                                    case 137:
                                        i9 = g10;
                                        for (int i19 = 1; i19 <= 8; i19++) {
                                            if (xVar3.h()) {
                                                eVarArr[8 - i19].d = true;
                                            }
                                        }
                                        break;
                                    case 138:
                                        i9 = g10;
                                        for (int i20 = 1; i20 <= 8; i20++) {
                                            if (xVar3.h()) {
                                                eVarArr[8 - i20].d = false;
                                            }
                                        }
                                        break;
                                    case 139:
                                        i9 = g10;
                                        for (int i21 = 1; i21 <= 8; i21++) {
                                            if (xVar3.h()) {
                                                eVarArr[8 - i21].d = !r1.d;
                                            }
                                        }
                                        break;
                                    case 140:
                                        i9 = g10;
                                        for (int i22 = 1; i22 <= 8; i22++) {
                                            if (xVar3.h()) {
                                                eVarArr[8 - i22].d();
                                            }
                                        }
                                        break;
                                    case 141:
                                        i9 = g10;
                                        xVar3.s(8);
                                        break;
                                    case 142:
                                        i9 = g10;
                                        break;
                                    case 143:
                                        i9 = g10;
                                        h();
                                        break;
                                    case 144:
                                        i9 = g10;
                                        if (!this.l.c) {
                                            xVar3.s(16);
                                            break;
                                        } else {
                                            xVar3.i(4);
                                            xVar3.i(2);
                                            xVar3.i(2);
                                            boolean h = xVar3.h();
                                            boolean h10 = xVar3.h();
                                            xVar3.i(3);
                                            xVar3.i(3);
                                            this.l.e(h, h10);
                                        }
                                    case 145:
                                        i9 = g10;
                                        if (this.l.c) {
                                            int c10 = e.c(xVar3.i(2), xVar3.i(2), xVar3.i(2), xVar3.i(2));
                                            int c11 = e.c(xVar3.i(2), xVar3.i(2), xVar3.i(2), xVar3.i(2));
                                            xVar3.s(2);
                                            e.c(xVar3.i(2), xVar3.i(2), xVar3.i(2), 0);
                                            this.l.f(c10, c11);
                                        } else {
                                            xVar3.s(24);
                                        }
                                        break;
                                    case 146:
                                        i9 = g10;
                                        if (this.l.c) {
                                            xVar3.s(4);
                                            int i23 = xVar3.i(4);
                                            xVar3.s(2);
                                            xVar3.i(6);
                                            e eVar2 = this.l;
                                            if (eVar2.v != i23) {
                                                eVar2.a('\n');
                                            }
                                            eVar2.v = i23;
                                        } else {
                                            xVar3.s(16);
                                        }
                                        break;
                                    case 147:
                                    case 148:
                                    case 149:
                                    case ImageReceiver.DEFAULT_CROSSFADE_DURATION /* 150 */:
                                    default:
                                        e2.c.t(i15, "Invalid C1 command: ", "Cea708Decoder");
                                        i9 = g10;
                                        break;
                                    case 151:
                                        i9 = g10;
                                        if (this.l.c) {
                                            int c12 = e.c(xVar3.i(2), xVar3.i(2), xVar3.i(2), xVar3.i(2));
                                            xVar3.i(2);
                                            e.c(xVar3.i(2), xVar3.i(2), xVar3.i(2), 0);
                                            xVar3.h();
                                            xVar3.h();
                                            xVar3.i(2);
                                            xVar3.i(2);
                                            int i24 = xVar3.i(2);
                                            xVar3.s(8);
                                            e eVar3 = this.l;
                                            eVar3.o = c12;
                                            eVar3.l = i24;
                                        } else {
                                            xVar3.s(32);
                                        }
                                        break;
                                    case 152:
                                    case 153:
                                    case 154:
                                    case 155:
                                    case 156:
                                    case 157:
                                    case 158:
                                    case 159:
                                        int i25 = i15 - 152;
                                        e eVar4 = eVarArr[i25];
                                        xVar3.s(i10);
                                        boolean h11 = xVar3.h();
                                        boolean h12 = xVar3.h();
                                        xVar3.h();
                                        int i26 = xVar3.i(i12);
                                        boolean h13 = xVar3.h();
                                        int i27 = xVar3.i(7);
                                        int i28 = xVar3.i(8);
                                        int i29 = xVar3.i(4);
                                        int i30 = xVar3.i(4);
                                        xVar3.s(i10);
                                        xVar3.i(6);
                                        xVar3.s(i10);
                                        int i31 = xVar3.i(3);
                                        int i32 = xVar3.i(3);
                                        ArrayList arrayList = eVar4.a;
                                        i9 = g10;
                                        eVar4.c = true;
                                        eVar4.d = h11;
                                        eVar4.k = h12;
                                        eVar4.e = i26;
                                        eVar4.f = h13;
                                        eVar4.g = i27;
                                        eVar4.h = i28;
                                        eVar4.i = i29;
                                        int i33 = i30 + 1;
                                        if (eVar4.j != i33) {
                                            eVar4.j = i33;
                                            while (true) {
                                                if ((h12 && arrayList.size() >= eVar4.j) || arrayList.size() >= 15) {
                                                    arrayList.remove(0);
                                                }
                                            }
                                        }
                                        if (i31 != 0 && eVar4.m != i31) {
                                            eVar4.m = i31;
                                            int i34 = i31 - 1;
                                            int i35 = e.C[i34];
                                            boolean z11 = e.B[i34];
                                            int i36 = e.z[i34];
                                            int i37 = e.A[i34];
                                            int i38 = e.y[i34];
                                            eVar4.o = i35;
                                            eVar4.l = i38;
                                        }
                                        if (i32 != 0 && eVar4.n != i32) {
                                            eVar4.n = i32;
                                            int i39 = i32 - 1;
                                            int i40 = e.E[i39];
                                            int i41 = e.D[i39];
                                            eVar4.e(false, false);
                                            eVar4.f(e.w, e.F[i39]);
                                        }
                                        if (this.p != i25) {
                                            this.p = i25;
                                            this.l = eVarArr[i25];
                                        }
                                        break;
                                }
                            } else {
                                i9 = g10;
                                if (i15 <= 255) {
                                    this.l.a((char) (i15 & 255));
                                } else {
                                    e2.c.t(i15, "Invalid base command: ", "Cea708Decoder");
                                }
                            }
                            z10 = true;
                        }
                        g10 = i9;
                        i10 = 2;
                        i12 = 3;
                    }
                }
            }
        }
        if (z10) {
            this.m = g();
        }
        this.o = null;
    }

    @Override // s4.i, k3.e
    public final void flush() {
        super.flush();
        this.m = null;
        this.n = null;
        this.p = 0;
        this.l = this.k[0];
        h();
        this.o = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List g() {
        d dVar;
        Layout.Alignment alignment;
        float f10;
        float f11;
        int i9;
        int i10;
        int i11;
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < 8; i12++) {
            e[] eVarArr = this.k;
            e eVar = eVarArr[i12];
            if (eVar.c && (!eVar.a.isEmpty() || eVar.b.length() != 0)) {
                e eVar2 = eVarArr[i12];
                if (eVar2.d) {
                    ArrayList arrayList2 = eVar2.a;
                    if (!eVar2.c || (arrayList2.isEmpty() && eVar2.b.length() == 0)) {
                        dVar = null;
                    } else {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                            spannableStringBuilder.append((CharSequence) arrayList2.get(i13));
                            spannableStringBuilder.append('\n');
                        }
                        spannableStringBuilder.append((CharSequence) eVar2.b());
                        int i14 = eVar2.l;
                        if (i14 != 0) {
                            if (i14 == 1) {
                                alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            } else if (i14 == 2) {
                                alignment = Layout.Alignment.ALIGN_CENTER;
                            } else if (i14 != 3) {
                                throw new IllegalArgumentException("Unexpected justification value: " + eVar2.l);
                            }
                            Layout.Alignment alignment2 = alignment;
                            if (eVar2.f) {
                                f10 = eVar2.h / 209.0f;
                                f11 = eVar2.g / 74.0f;
                            } else {
                                f10 = eVar2.h / 99.0f;
                                f11 = eVar2.g / 99.0f;
                            }
                            float f12 = (f10 * 0.9f) + 0.05f;
                            float f13 = (f11 * 0.9f) + 0.05f;
                            int i15 = eVar2.i;
                            i9 = i15 / 3;
                            if (i9 != 0) {
                                i10 = i15;
                                i11 = 0;
                            } else if (i9 == 1) {
                                i10 = i15;
                                i11 = 1;
                            } else {
                                i10 = i15;
                                i11 = 2;
                            }
                            int i16 = i10 % 3;
                            int i17 = i16 != 0 ? 0 : i16 == 1 ? 1 : 2;
                            int i18 = eVar2.o;
                            dVar = new d(spannableStringBuilder, alignment2, f13, i11, f12, i17, i18 == e.x, i18, eVar2.e);
                        }
                        alignment = Layout.Alignment.ALIGN_NORMAL;
                        Layout.Alignment alignment22 = alignment;
                        if (eVar2.f) {
                        }
                        float f122 = (f10 * 0.9f) + 0.05f;
                        float f132 = (f11 * 0.9f) + 0.05f;
                        int i152 = eVar2.i;
                        i9 = i152 / 3;
                        if (i9 != 0) {
                        }
                        int i162 = i10 % 3;
                        if (i162 != 0) {
                        }
                        int i182 = eVar2.o;
                        dVar = new d(spannableStringBuilder, alignment22, f132, i11, f122, i17, i182 == e.x, i182, eVar2.e);
                    }
                    if (dVar != null) {
                        arrayList.add(dVar);
                    }
                } else {
                    continue;
                }
            }
        }
        Collections.sort(arrayList, d.c);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        for (int i19 = 0; i19 < arrayList.size(); i19++) {
            arrayList3.add(((d) arrayList.get(i19)).a);
        }
        return DesugarCollections.unmodifiableList(arrayList3);
    }

    @Override // k3.e
    public final String getName() {
        return "Cea708Decoder";
    }

    public final void h() {
        for (int i9 = 0; i9 < 8; i9++) {
            this.k[i9].d();
        }
    }
}
