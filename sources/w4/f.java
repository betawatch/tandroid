package w4;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import androidx.car.app.navigation.model.Maneuver;
import h5.v;
import h5.w;
import j$.util.DesugarCollections;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import oh.h4;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class f extends i {
    public final w g = new w();
    public final v h = new v();
    public int i = -1;
    public final int j;
    public final e[] k;
    public e l;
    public List m;
    public List n;
    public v o;
    public int p;

    public f(int i10, List list) {
        this.j = i10 == -1 ? 1 : i10;
        if (list != null && list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
            byte b10 = ((byte[]) list.get(0))[0];
        }
        this.k = new e[8];
        for (int i11 = 0; i11 < 8; i11++) {
            this.k[i11] = new e();
        }
        this.l = this.k[0];
    }

    @Override // w4.i
    public final h4 e() {
        List list = this.m;
        this.n = list;
        list.getClass();
        return new h4(list, 24);
    }

    @Override // w4.i
    public final void f(g gVar) {
        ByteBuffer byteBuffer = gVar.d;
        byteBuffer.getClass();
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        w wVar = this.g;
        wVar.D(limit, array);
        while (wVar.a() >= 3) {
            int u10 = wVar.u();
            int i10 = u10 & 3;
            boolean z4 = (u10 & 4) == 4;
            byte u11 = (byte) wVar.u();
            byte u12 = (byte) wVar.u();
            if (i10 == 2 || i10 == 3) {
                if (z4) {
                    if (i10 == 3) {
                        i();
                        int i11 = (u11 & 192) >> 6;
                        int i12 = this.i;
                        if (i12 != -1 && i11 != (i12 + 1) % 4) {
                            k();
                            h5.a.K("Cea708Decoder", "Sequence number discontinuity. previous=" + this.i + " current=" + i11);
                        }
                        this.i = i11;
                        int i13 = u11 & 63;
                        if (i13 == 0) {
                            i13 = 64;
                        }
                        v vVar = new v(i11, i13);
                        this.o = vVar;
                        byte[] bArr = vVar.b;
                        vVar.e = 1;
                        bArr[0] = u12;
                    } else {
                        h5.a.f(i10 == 2);
                        v vVar2 = this.o;
                        if (vVar2 == null) {
                            h5.a.o("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = vVar2.b;
                            int i14 = vVar2.e;
                            int i15 = i14 + 1;
                            vVar2.e = i15;
                            bArr2[i14] = u11;
                            vVar2.e = i14 + 2;
                            bArr2[i15] = u12;
                        }
                    }
                    v vVar3 = this.o;
                    if (vVar3.e == (vVar3.d * 2) - 1) {
                        i();
                    }
                }
            }
        }
    }

    @Override // w4.i, n3.e
    public final void flush() {
        super.flush();
        this.m = null;
        this.n = null;
        this.p = 0;
        this.l = this.k[0];
        k();
        this.o = null;
    }

    @Override // w4.i
    public final boolean h() {
        return this.m != this.n;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void i() {
        int i10;
        v vVar = this.o;
        if (vVar == null) {
            return;
        }
        int i11 = 2;
        if (vVar.e != (vVar.d * 2) - 1) {
            h5.a.n("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.o.d * 2) - 1) + ", but current index is " + this.o.e + " (sequence number " + this.o.c + ");");
        }
        v vVar2 = this.o;
        byte[] bArr = vVar2.b;
        int i12 = vVar2.e;
        v vVar3 = this.h;
        vVar3.n(i12, bArr);
        boolean z4 = false;
        while (true) {
            if (vVar3.b() > 0) {
                int i13 = 3;
                int i14 = vVar3.i(3);
                int i15 = vVar3.i(5);
                if (i14 == 7) {
                    vVar3.s(i11);
                    i14 = vVar3.i(6);
                    if (i14 < 7) {
                        e2.c.q(i14, "Invalid extended service number: ", "Cea708Decoder");
                    }
                }
                if (i15 == 0) {
                    if (i14 != 0) {
                        h5.a.K("Cea708Decoder", "serviceNumber is non-zero (" + i14 + ") when blockSize is 0");
                    }
                } else if (i14 != this.j) {
                    vVar3.t(i15);
                } else {
                    int g10 = (i15 * 8) + vVar3.g();
                    while (vVar3.g() < g10) {
                        int i16 = vVar3.i(8);
                        if (i16 == 16) {
                            i10 = g10;
                            int i17 = vVar3.i(8);
                            if (i17 <= 31) {
                                if (i17 > 7) {
                                    if (i17 <= 15) {
                                        vVar3.s(8);
                                    } else if (i17 <= 23) {
                                        vVar3.s(16);
                                    } else if (i17 <= 31) {
                                        vVar3.s(24);
                                    }
                                }
                            } else if (i17 <= 127) {
                                if (i17 == 32) {
                                    this.l.a(' ');
                                } else if (i17 == 33) {
                                    this.l.a((char) 160);
                                } else if (i17 == 37) {
                                    this.l.a((char) 8230);
                                } else if (i17 == 42) {
                                    this.l.a((char) 352);
                                } else if (i17 == 44) {
                                    this.l.a((char) 338);
                                } else if (i17 == 63) {
                                    this.l.a((char) 376);
                                } else if (i17 == 57) {
                                    this.l.a((char) 8482);
                                } else if (i17 == 58) {
                                    this.l.a((char) 353);
                                } else if (i17 == 60) {
                                    this.l.a((char) 339);
                                } else if (i17 != 61) {
                                    switch (i17) {
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
                                            switch (i17) {
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
                                                    e2.c.q(i17, "Invalid G2 character: ", "Cea708Decoder");
                                                    break;
                                            }
                                    }
                                } else {
                                    this.l.a((char) 8480);
                                }
                                z4 = true;
                            } else if (i17 <= 159) {
                                if (i17 <= 135) {
                                    vVar3.s(32);
                                } else if (i17 <= 143) {
                                    vVar3.s(40);
                                } else if (i17 <= 159) {
                                    vVar3.s(2);
                                    vVar3.s(vVar3.i(6) * 8);
                                }
                            } else if (i17 <= 255) {
                                if (i17 == 160) {
                                    this.l.a((char) 13252);
                                } else {
                                    e2.c.q(i17, "Invalid G3 character: ", "Cea708Decoder");
                                    this.l.a('_');
                                }
                                z4 = true;
                            } else {
                                e2.c.q(i17, "Invalid extended command: ", "Cea708Decoder");
                            }
                        } else if (i16 <= 31) {
                            if (i16 != 0) {
                                if (i16 == i13) {
                                    this.m = j();
                                } else if (i16 != 8) {
                                    switch (i16) {
                                        case 12:
                                            k();
                                            break;
                                        case 13:
                                            this.l.a('\n');
                                            break;
                                        case 14:
                                            break;
                                        default:
                                            if (i16 < 17 || i16 > 23) {
                                                if (i16 < 24 || i16 > 31) {
                                                    e2.c.q(i16, "Invalid C0 command: ", "Cea708Decoder");
                                                    break;
                                                } else {
                                                    h5.a.K("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i16);
                                                    vVar3.s(16);
                                                    break;
                                                }
                                            } else {
                                                h5.a.K("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i16);
                                                vVar3.s(8);
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
                            i10 = g10;
                        } else if (i16 <= 127) {
                            if (i16 == 127) {
                                this.l.a((char) 9835);
                            } else {
                                this.l.a((char) (i16 & 255));
                            }
                            i10 = g10;
                            z4 = true;
                        } else {
                            if (i16 <= 159) {
                                e[] eVarArr = this.k;
                                switch (i16) {
                                    case 128:
                                    case 129:
                                    case 130:
                                    case 131:
                                    case 132:
                                    case 133:
                                    case 134:
                                    case 135:
                                        i10 = g10;
                                        int i18 = i16 - 128;
                                        if (this.p != i18) {
                                            this.p = i18;
                                            this.l = eVarArr[i18];
                                            break;
                                        }
                                        break;
                                    case 136:
                                        i10 = g10;
                                        for (int i19 = 1; i19 <= 8; i19++) {
                                            if (vVar3.h()) {
                                                e eVar = eVarArr[8 - i19];
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
                                        i10 = g10;
                                        for (int i20 = 1; i20 <= 8; i20++) {
                                            if (vVar3.h()) {
                                                eVarArr[8 - i20].d = true;
                                            }
                                        }
                                        break;
                                    case 138:
                                        i10 = g10;
                                        for (int i21 = 1; i21 <= 8; i21++) {
                                            if (vVar3.h()) {
                                                eVarArr[8 - i21].d = false;
                                            }
                                        }
                                        break;
                                    case 139:
                                        i10 = g10;
                                        for (int i22 = 1; i22 <= 8; i22++) {
                                            if (vVar3.h()) {
                                                eVarArr[8 - i22].d = !r1.d;
                                            }
                                        }
                                        break;
                                    case 140:
                                        i10 = g10;
                                        for (int i23 = 1; i23 <= 8; i23++) {
                                            if (vVar3.h()) {
                                                eVarArr[8 - i23].d();
                                            }
                                        }
                                        break;
                                    case 141:
                                        i10 = g10;
                                        vVar3.s(8);
                                        break;
                                    case 142:
                                        i10 = g10;
                                        break;
                                    case 143:
                                        i10 = g10;
                                        k();
                                        break;
                                    case 144:
                                        i10 = g10;
                                        if (!this.l.c) {
                                            vVar3.s(16);
                                            break;
                                        } else {
                                            vVar3.i(4);
                                            vVar3.i(2);
                                            vVar3.i(2);
                                            boolean h = vVar3.h();
                                            boolean h9 = vVar3.h();
                                            vVar3.i(3);
                                            vVar3.i(3);
                                            this.l.e(h, h9);
                                        }
                                    case 145:
                                        i10 = g10;
                                        if (this.l.c) {
                                            int c3 = e.c(vVar3.i(2), vVar3.i(2), vVar3.i(2), vVar3.i(2));
                                            int c10 = e.c(vVar3.i(2), vVar3.i(2), vVar3.i(2), vVar3.i(2));
                                            vVar3.s(2);
                                            e.c(vVar3.i(2), vVar3.i(2), vVar3.i(2), 0);
                                            this.l.f(c3, c10);
                                        } else {
                                            vVar3.s(24);
                                        }
                                        break;
                                    case 146:
                                        i10 = g10;
                                        if (this.l.c) {
                                            vVar3.s(4);
                                            int i24 = vVar3.i(4);
                                            vVar3.s(2);
                                            vVar3.i(6);
                                            e eVar2 = this.l;
                                            if (eVar2.v != i24) {
                                                eVar2.a('\n');
                                            }
                                            eVar2.v = i24;
                                        } else {
                                            vVar3.s(16);
                                        }
                                        break;
                                    case 147:
                                    case 148:
                                    case 149:
                                    case ImageReceiver.DEFAULT_CROSSFADE_DURATION /* 150 */:
                                    default:
                                        e2.c.q(i16, "Invalid C1 command: ", "Cea708Decoder");
                                        i10 = g10;
                                        break;
                                    case 151:
                                        i10 = g10;
                                        if (this.l.c) {
                                            int c11 = e.c(vVar3.i(2), vVar3.i(2), vVar3.i(2), vVar3.i(2));
                                            vVar3.i(2);
                                            e.c(vVar3.i(2), vVar3.i(2), vVar3.i(2), 0);
                                            vVar3.h();
                                            vVar3.h();
                                            vVar3.i(2);
                                            vVar3.i(2);
                                            int i25 = vVar3.i(2);
                                            vVar3.s(8);
                                            e eVar3 = this.l;
                                            eVar3.o = c11;
                                            eVar3.l = i25;
                                        } else {
                                            vVar3.s(32);
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
                                        int i26 = i16 - 152;
                                        e eVar4 = eVarArr[i26];
                                        vVar3.s(i11);
                                        boolean h10 = vVar3.h();
                                        boolean h11 = vVar3.h();
                                        vVar3.h();
                                        int i27 = vVar3.i(i13);
                                        boolean h12 = vVar3.h();
                                        int i28 = vVar3.i(7);
                                        int i29 = vVar3.i(8);
                                        int i30 = vVar3.i(4);
                                        int i31 = vVar3.i(4);
                                        vVar3.s(i11);
                                        vVar3.i(6);
                                        vVar3.s(i11);
                                        int i32 = vVar3.i(3);
                                        int i33 = vVar3.i(3);
                                        ArrayList arrayList = eVar4.a;
                                        i10 = g10;
                                        eVar4.c = true;
                                        eVar4.d = h10;
                                        eVar4.k = h11;
                                        eVar4.e = i27;
                                        eVar4.f = h12;
                                        eVar4.g = i28;
                                        eVar4.h = i29;
                                        eVar4.i = i30;
                                        int i34 = i31 + 1;
                                        if (eVar4.j != i34) {
                                            eVar4.j = i34;
                                            while (true) {
                                                if ((h11 && arrayList.size() >= eVar4.j) || arrayList.size() >= 15) {
                                                    arrayList.remove(0);
                                                }
                                            }
                                        }
                                        if (i32 != 0 && eVar4.m != i32) {
                                            eVar4.m = i32;
                                            int i35 = i32 - 1;
                                            int i36 = e.C[i35];
                                            boolean z10 = e.B[i35];
                                            int i37 = e.z[i35];
                                            int i38 = e.A[i35];
                                            int i39 = e.y[i35];
                                            eVar4.o = i36;
                                            eVar4.l = i39;
                                        }
                                        if (i33 != 0 && eVar4.n != i33) {
                                            eVar4.n = i33;
                                            int i40 = i33 - 1;
                                            int i41 = e.E[i40];
                                            int i42 = e.D[i40];
                                            eVar4.e(false, false);
                                            eVar4.f(e.w, e.F[i40]);
                                        }
                                        if (this.p != i26) {
                                            this.p = i26;
                                            this.l = eVarArr[i26];
                                        }
                                        break;
                                }
                            } else {
                                i10 = g10;
                                if (i16 <= 255) {
                                    this.l.a((char) (i16 & 255));
                                } else {
                                    e2.c.q(i16, "Invalid base command: ", "Cea708Decoder");
                                }
                            }
                            z4 = true;
                        }
                        g10 = i10;
                        i11 = 2;
                        i13 = 3;
                    }
                }
            }
        }
        if (z4) {
            this.m = j();
        }
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
    public final List j() {
        d dVar;
        Layout.Alignment alignment;
        float f10;
        float f11;
        int i10;
        int i11;
        int i12;
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < 8; i13++) {
            e[] eVarArr = this.k;
            e eVar = eVarArr[i13];
            if (eVar.c && (!eVar.a.isEmpty() || eVar.b.length() != 0)) {
                e eVar2 = eVarArr[i13];
                if (eVar2.d) {
                    ArrayList arrayList2 = eVar2.a;
                    if (!eVar2.c || (arrayList2.isEmpty() && eVar2.b.length() == 0)) {
                        dVar = null;
                    } else {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                            spannableStringBuilder.append((CharSequence) arrayList2.get(i14));
                            spannableStringBuilder.append('\n');
                        }
                        spannableStringBuilder.append((CharSequence) eVar2.b());
                        int i15 = eVar2.l;
                        if (i15 != 0) {
                            if (i15 == 1) {
                                alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            } else if (i15 == 2) {
                                alignment = Layout.Alignment.ALIGN_CENTER;
                            } else if (i15 != 3) {
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
                            int i16 = eVar2.i;
                            i10 = i16 / 3;
                            if (i10 != 0) {
                                i11 = i16;
                                i12 = 0;
                            } else if (i10 == 1) {
                                i11 = i16;
                                i12 = 1;
                            } else {
                                i11 = i16;
                                i12 = 2;
                            }
                            int i17 = i11 % 3;
                            int i18 = i17 != 0 ? 0 : i17 == 1 ? 1 : 2;
                            int i19 = eVar2.o;
                            dVar = new d(spannableStringBuilder, alignment2, f13, i12, f12, i18, i19 == e.x, i19, eVar2.e);
                        }
                        alignment = Layout.Alignment.ALIGN_NORMAL;
                        Layout.Alignment alignment22 = alignment;
                        if (eVar2.f) {
                        }
                        float f122 = (f10 * 0.9f) + 0.05f;
                        float f132 = (f11 * 0.9f) + 0.05f;
                        int i162 = eVar2.i;
                        i10 = i162 / 3;
                        if (i10 != 0) {
                        }
                        int i172 = i11 % 3;
                        if (i172 != 0) {
                        }
                        int i192 = eVar2.o;
                        dVar = new d(spannableStringBuilder, alignment22, f132, i12, f122, i18, i192 == e.x, i192, eVar2.e);
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
        for (int i20 = 0; i20 < arrayList.size(); i20++) {
            arrayList3.add(((d) arrayList.get(i20)).a);
        }
        return DesugarCollections.unmodifiableList(arrayList3);
    }

    public final void k() {
        for (int i10 = 0; i10 < 8; i10++) {
            this.k[i10].d();
        }
    }
}
